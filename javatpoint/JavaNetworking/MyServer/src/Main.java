import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int PORT = 6666;

        try (ServerSocket serverSocker = new ServerSocket(PORT)) {
            System.out.println("Server started, wairing for connection...");
            try (
                    Socket socket = serverSocker.accept();
                    DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                    Scanner scanner = new Scanner(System.in);
            ) {
                String message = dataInputStream.readUTF();
                System.out.println("Received message: " + message);
                System.out.println("Enter a message to send to the client: ");
                String messageToClient = scanner.nextLine();
                dataOutputStream.writeUTF(messageToClient);
            } catch (IOException e) {
                System.out.println("Error during connection: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Could not start server: " + e.getMessage());
        }
    }
}