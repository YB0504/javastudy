package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReceiveThread extends Thread {
    // 접속하는 모든 클라이언트의 출력 스트림을 저장하는 동기화 리스트
    static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

    Socket socket = null;
    BufferedReader in = null;
    PrintWriter out = null;

    public ReceiveThread(Socket socket) {
        // 입출력 스트림의 초기화
        this.socket = socket;
        try {
            out = new PrintWriter(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            list.add(out);  // 새로 생성된 출력 스트림을 list에 저장
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String name = "";
        try {
            // 클라이언트가 처음 접속할 때 이름을 수신
            name = in.readLine();
            System.out.println("[" + name + " 새연결 생성]");
            sendAll("[" + name + "]님이 들어왔습니다.");

            while (in != null) {
                String inputMsg = in.readLine();
                if ("quit".equals(inputMsg)) {
                    break;
                }
                sendAll(name + ">>" + inputMsg);
            }
        } catch (IOException e) {
            System.out.println("[" + name + "] 접속 끊김");
        } finally {
            sendAll("[" + name + "]님이 나갔습니다.");
            list.remove(out);
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[" + name + "] 연결 종료");
    }

    private void sendAll(String s) {
        for (PrintWriter out : list) {
            // 리스트에 저장했던 모든 출력 스트림을 통한 메시지 전송
            out.println(s);
            out.flush();
        }
    }
}

// 멀티 채팅의 서버에서는 서버 소켓이 루프를 돌면서 클라이언트가 연결될 때마다
// 새로운 스레드를 생성한다.
// 이렇게 생성된 스레드는 클라이언트에서 메시지가 들어올 때마다
// 전체 클라이언트에 해당 메시지를 전송한다.
public class MultiServer {
    public static void main(String[] args) {
        MultiServer multiServer = new MultiServer();
        multiServer.start();
    }

    public void start() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            // 포트에 해당하는 소켓 생성
            serverSocket = new ServerSocket(8000);
            while (true) {
                System.out.println("[클라이언트 연결대기중]");
                // 연결된 포트에서 클라이언트의 접속 대기
                socket = serverSocket.accept();

                // client가 접속할 때마다 새로운 스레드를 생성
                ReceiveThread receiveThread = new ReceiveThread(socket);
                receiveThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                    System.out.println("[서버종료]");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("[서버소켓통신에러]");
                }
            }
        }
    }
}
