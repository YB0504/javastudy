package Socket.chat;

import java.io.*;
import java.net.Socket;

public class ServerSocketThread extends Thread {
    Socket socket;
    ChatServer server;
    BufferedReader in;
    PrintWriter out;
    String name;
    String threadName;

    public ServerSocketThread(ChatServer server, Socket socket) {
        this.socket = socket;
        this.server = server;
        // 스레드의 이름은 디버깅, log 를 구별하는데 유용하다.
        threadName = super.getName();   // Thread 내부의 스레드 이름을 반환하는 메소드
        System.out.println(socket.getInetAddress() + "님이 입장했습니다.");
        System.out.println("Thread Name : " + threadName);
    }

    // 클라이언트로 메시지 출력
    public void sendMessage(String s) {
        out.println(s);
    }

    // 스레드 run() 구현
    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // true로 설정하면 autoFlush로 설정된다.
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

            sendMessage("대화자 이름을 입력하세요.");
            name = in.readLine();
            server.sendChat("[" + name + "]님이 입장했습니다.");

            while (true) {
                String s_in = in.readLine();
                server.sendChat("[" + name + "] " + s_in);
            }
        } catch (IOException e) {
            System.out.println(threadName + " 퇴장했습니다.");
            server.removeClient(this);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
