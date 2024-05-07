package Exercise;

import java.util.Scanner;

public class Exercise04_10 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.println("1 ~ 100사이의 값 입력 : ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("정답");
                System.out.println("시도 횟수는 : "+count+"번 입니다.");
                break;
            }
        } while (true);
    }
}
