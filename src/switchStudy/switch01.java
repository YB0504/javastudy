package switchStudy;

import java.util.Scanner;

public class switch01 {
    public static void main(String[] args) {
        System.out.println("현재 월 입력");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            // 다음과 괕이 case를 아래로 나열하거나
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
                // 옆으로 나열하여도 상관없다.
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("겨울");
        }
    }
}
