package java_level_test_week2;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 숫자를 입력하세요 :");
        int num = scanner.nextInt();

        countdown(num);
    }

    private static void countdown(int num) {
        for (int i = num; i >= 0; i--) {
            print(i);
            if (i == 0) {
                break;
            }
        }
    }

    private static void print(int num) {
        System.out.println(num);
    }
}
