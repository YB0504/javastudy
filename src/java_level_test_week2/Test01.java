package java_level_test_week2;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요.");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();

        System.out.println("세번째 숫자를 입력하세요.");
        int num3 = scanner.nextInt();

        checkNums(num1, num2, num3);
    }

    private static void checkNums(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            print("세 숫자가 모두 같습니다.");
        } else if (num1 == num2 || num2 == num3) {
            print("두 숫자가 같습니다.");
        } else if (num1 == num3) {
            print("두 숫자가 같습니다.");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            print("세 숫자가 모두 다릅니다.");
        }
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
