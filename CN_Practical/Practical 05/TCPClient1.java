
// TCP Client
import java.io.*;
import java.net.*;

public class TCPClient1 {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 6789
            Socket clientSocket = new Socket("localhost", 6789);

            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String clientMessage = "Hello from Client Aniruddha";
            outToServer.writeBytes(clientMessage + '\n');

            String serverMessage = inFromServer.readLine();
            System.out.println("Received from server: " + serverMessage);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
