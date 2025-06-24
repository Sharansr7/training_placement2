import java.net.*;
import java.io.*;

public class CurrencyConverter {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.exchangerate-api.com/v4/latest/USD");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line, json = "";
        while ((line = br.readLine()) != null)
            json += line;
        System.out.println("Data: " + json);
        // Use a JSON parser to extract rates
    }
}
