package Socket.chat;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClientGuiMain {
    public static void main(String[] args) {
        try {
            // 현재 접속 중인 local IP 를 가져온다.
            InetAddress address = InetAddress.getLocalHost();
            String ipStr = address.toString();  // 가져온 IP를 문자열로 변환
            String ip = ipStr.substring(ipStr.indexOf("/") + 1); // "/" 를 제외한 순수 IP 주소만 가져와서 저장한다.

            // 단순하게 객체를 생성하고 보여주기만 하는 방식
            new ClientGui(ip, 5420);
            // 추후 객체에 접근하여 객체의 메소드를 호출할 수 있게 만드는 방식
//            ClientGui clientGui = new ClientGui(ip, 5420);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
