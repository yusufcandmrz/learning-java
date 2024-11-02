import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        final String HOST = "localhost";
        final int PORT = 6666;

        try(
                Socket socket = new Socket(HOST, PORT);
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                ) {
            String message = "Hello Server";
            dataOutputStream.writeUTF(message);
            System.out.println("Message sent to the server: " + message);
            String messageFromServer = dataInputStream.readUTF();
            System.out.println("Message from server: " + messageFromServer);
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}