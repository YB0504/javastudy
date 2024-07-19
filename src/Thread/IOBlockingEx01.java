package Thread;

import javax.swing.*;

public class IOBlockingEx01 {
    public static void main(String[] args) throws Exception {
        String input = JOptionPane.showInputDialog("ggg");
        System.out.println("입력 값 : " + input);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
