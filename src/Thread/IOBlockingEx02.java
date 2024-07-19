package Thread;

import javax.swing.*;

class ThreadMulti extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

public class IOBlockingEx02 {
    public static void main(String[] args) throws Exception {
        ThreadMulti threadMulti = new ThreadMulti();
        threadMulti.start();

        String input = JOptionPane.showInputDialog("ggg");
        System.out.println("입력 값 : " + input);
    }
}
