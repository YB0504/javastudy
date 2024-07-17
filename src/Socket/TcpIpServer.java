package Socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            // 서버 소켓을 생성하여 포트 번호와 결합(bind)
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + "서버가 준비되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                System.out.println(getTime() + "연결요청을 기다립니다.");

                // 서버 소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 대기
                // 연결 요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");

                // 소켓의 출력스트림을 얻는다.
                OutputStream outputStream = socket.getOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

                // 원격 소켓에 데이터를 보낸다.
                dataOutputStream.writeUTF("[Notice] Test Message1 from Server");
                System.out.println(getTime() + "데이터를 전송했습니다.");

                // 스트림과 소켓을 닫아준다.
                dataOutputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[hh:mm:ss]");
        return simpleDateFormat.format(new Date());
    }
}
