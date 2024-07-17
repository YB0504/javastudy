package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) {
        BufferedReader reader = null;
        PrintWriter writer = null;

        ServerSocket serverSocket = null;
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(8000);

            System.out.println("[Server 실행] Client 연결 대기중...");
            socket = serverSocket.accept();

            System.out.println("Client 연결됨");
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());

            while (true) {
                // 수신 데이터 한줄씩 읽기
                String inputMsg = reader.readLine();
                if ("quit".equalsIgnoreCase(inputMsg)) {
                    break;
                }

                System.out.println("From Client : " + inputMsg);
                System.out.print("전송하기>>>");

                String outputMsg = scanner.nextLine();
                writer.println(outputMsg);
                writer.flush();

                if ("quit".equalsIgnoreCase(outputMsg)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                scanner.close();
                socket.close();
                serverSocket.close();
                System.out.println("연결 종료");
            } catch (IOException e) {
                System.out.println("소켓 통신 에러");
            }
        }
    }
}
