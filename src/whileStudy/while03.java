package whileStudy;

import java.util.Scanner;

public class while03 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자 입력");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        num = Integer.parseInt(str);

        System.out.println("sum += num % 10");
        System.out.println("num은 초기 입력 값");
        while (num != 0) {
            sum += num % 10;
            System.out.println("sum = " + sum + " num = " + num);

            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
