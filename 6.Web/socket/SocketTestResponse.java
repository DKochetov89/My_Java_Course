package web.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketTestResponse {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket socket = serverSocket.accept();
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                if (str.equals("exit")) {
                    break;
                } else printWriter.write("OK");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
