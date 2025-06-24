import javax.swing.*;
import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        JFrame f = new JFrame("Chat");
        JTextField msg = new JTextField();
        JTextArea chat = new JTextArea();
        JButton send = new JButton("Send");

        msg.setBounds(10, 250, 200, 30);
        send.setBounds(220, 250, 80, 30);
        chat.setBounds(10, 10, 290, 230);
        f.add(msg); f.add(send); f.add(chat);
        f.setSize(320, 350); f.setLayout(null); f.setVisible(true);

        send.addActionListener(e -> {
            out.println(msg.getText());
            chat.append("Me: " + msg.getText() + "\n");
            msg.setText("");
        });

        new Thread(() -> {
            String str;
            try {
                while ((str = in.readLine()) != null)
                    chat.append("Server: " + str + "\n");
            } catch (IOException ignored) {}
        }).start();
    }
}
