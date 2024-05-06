package ifStudy;

import java.util.Scanner;

public class ifElse01 {
    public static void main(String[] args) {
        System.out.println("숫자 입력");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("입력한 숫자는 0");
        } else {
            System.out.println("0이 아니다.");
        }
    }
}
