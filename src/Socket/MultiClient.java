package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

class SendThread extends Thread {
    Socket socket = null;
    String name;

    Scanner scanner = new Scanner(System.in);

    public SendThread(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            // 클라이언트가 처음 접속할 때 서버에 이름을 보낸다.
            PrintStream out = new PrintStream(socket.getOutputStream());
            out.println(name);
            out.flush();

            while (true) {
                // 사용자의 메시지를 서버로 전송
                // 특정 메시지를 전송하면 루프를 빠져나온다.
                String outputMsg = scanner.nextLine();
                out.println(outputMsg);
                out.flush();
                if ("quit".equals(outputMsg)) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class MultiClient {
    public static void main(String[] args) {
        MultiClient multiClient = new MultiClient();
        multiClient.start();
    }

    public void start() {
        Socket socket = null;
        BufferedReader in = null;

        try {
            // 소켓을 생성하고 해당 포트의 서버와 연결
            socket = new Socket("localhost", 8000);
            System.out.println("[서버와 연결되었습니다.]");

            String name = "user" + (int) (Math.random() * 10);
            Thread thread = new SendThread(socket, name);
            thread.start();

            // 서버에서 넘어오는 메시지를 읽고 출력
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (in != null) {
                String inputMsg = in.readLine();
                if (("[" + name + "]님이 나갔습니다.").equals(inputMsg)) break;
                System.out.println("From : " + inputMsg);
            }
        } catch (IOException e) {
            System.out.println("[서버 접속 끊김]");
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[서버 연결 종료]");
    }
}
