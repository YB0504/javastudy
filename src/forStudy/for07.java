package forStudy;

import java.util.Scanner;

public class for07 {
    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        for (int i = 1; i <= 20; i++) {
            number = (int) (Math.random() * 100) + 1;
            System.out.print(number + " ");

            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("\n짝수는 "+count+"개 입니다.");
    }
}
