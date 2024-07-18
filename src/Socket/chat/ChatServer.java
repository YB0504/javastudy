package Socket.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    ServerSocket serverSocket;
    Socket socket;
    List<Thread> list;  // ServerSocket Thread 객체 저장

    public ChatServer() {
        list = new ArrayList<>();
        System.out.println("서버 시작");
    }

    public void giveAndTake() {
        try {
            serverSocket = new ServerSocket(5420);
            serverSocket.setReuseAddress(true); // 서버 소켓이 포트를 다시 사용하도록 설정

            while (true) {
                socket = serverSocket.accept(); // 접속 대기 -> 접속 허용
                ServerSocketThread thread = new ServerSocketThread(this, socket);
                addClient(thread);  // 새로 접속한 Thread 마다 list 에 Thread 객체 저장
                thread.start();     // Thread 내부 start()
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // synchronized : 스레드들이 공유 데이터를 함께 사용하지 못하도록 한다.
    // 클라이언트 접속 시 호출되며 리스트에 클라이언트 담당 스레드를 저장
    private synchronized void addClient(ServerSocketThread thread) {
        list.add(thread);
        System.out.println("Client 1명 입장. 총 : " + list.size() + "명");
    }

    // 클라이언트 퇴장 시 호출되며 퇴장한 클라이언트 담당 스레드 제거
    public synchronized void removeClient(Thread thread) {
        list.remove(thread);
        System.out.println("Client 1명 퇴장. 총 : " + list.size() + "명");
    }

    // 채팅 내용 전달
    public synchronized void sendChat(String s) {
        for (int i = 0; i < list.size(); i++) {
            ServerSocketThread thread = (ServerSocketThread) list.get(i);
            thread.sendMessage(s);
        }
    }
}
