package Socket.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientGui extends JFrame implements ActionListener, Runnable {
    Container container = getContentPane();
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    JTextField textField = new JTextField();

    // 통신 시 필요
    Socket socket;
    PrintWriter out;
    BufferedReader in;
    String s;

    // GUI 화면이 출력 되면서 설정, 실행될 내용들
    public ClientGui(String ip, int port) {
        setTitle("Socket Chat");
        setSize(550, 400);
        setLocation(400, 400);
        init();
        start();
        setVisible(true);

        // 통신 초기화
        initNet(ip, port);
        System.out.println("ip : " + ip);
    }

    private void initNet(String ip, int port) {
        try {
            // 서버 접속 시도
            socket = new Socket(ip, port);

            // 입출력 설정
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        } catch (UnknownHostException e) {
            System.out.println("IP 주소가 다릅니다.");
        } catch (IOException e) {
            System.out.println("접속 실패");
        }
        // 스레드 구동
        // 스레드 객체가 생성되면서 run() 실행
        Thread thread = new Thread(this);
        thread.start();
    }

    private void init() {
        container.setLayout(new BorderLayout());
        container.add("Center", scrollPane);
        container.add("South", textField);
    }

    private void start() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField.addActionListener(this);
    }

    // 응답 대기
    // 서버로부터 전달된 문자열을 읽어서 textArea에 출력
    @Override
    public void run() {
        while (true) {
            try {
                s = in.readLine();
                textArea.append(s + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // textField 문자열을 읽어서 서버로 전송
        s = textField.getText();
        out.println(s);

        textField.setText("");
    }
}
