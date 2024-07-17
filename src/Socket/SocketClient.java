package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) {
        BufferedReader reader = null;
        PrintWriter writer = null;

        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new Socket("127.0.0.1", 8000);

            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());

            while (true) {
                System.out.print("전송하기>>>");
                String outputMsg = scanner.nextLine();
                writer.println(outputMsg);
                writer.flush();
                if ("quit".equalsIgnoreCase(outputMsg)) {
                    break;
                }

                String inputMsg = reader.readLine();
                System.out.println("From Server : " + inputMsg);
                if ("quit".equalsIgnoreCase(inputMsg)) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                scanner.close();
                if (socket != null) {
                    socket.close();
                }
                System.out.println("서버 연결 종료");
            } catch (IOException e) {
                System.out.println("소켓통신에러");
            }
        }
    }
}
