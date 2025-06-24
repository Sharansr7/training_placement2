import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static final int PORT = 1234;
    private static Set<Socket> clients = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started on port " + PORT);

        while (true) {
            Socket client = serverSocket.accept();
            clients.add(client);
            new ClientHandler(client).start();
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private BufferedReader input;

        ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }

        public void run() {
            try {
                String msg;
                while ((msg = input.readLine()) != null) {
                    broadcast(msg);
                }
            } catch (IOException e) {
                System.out.println("Client disconnected.");
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {}
                clients.remove(socket);
            }
        }

        private void broadcast(String message) throws IOException {
            for (Socket s : clients) {
                PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                out.println("Client: " + message);
            }
        }
    }
}
client.java
  import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        new Thread(() -> {
            try {
                BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String serverMsg;
                while ((serverMsg = serverIn.readLine()) != null) {
                    System.out.println(serverMsg);
                }
            } catch (IOException e) {}
        }).start();

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String userMsg;
        while ((userMsg = userInput.readLine()) != null) {
            out.println(userMsg);
        }
    }
}
