package whileStudy;

import java.util.Scanner;

public class doWhile01 {
    public static void main(String[] args) {
//        do {
//            조건식의 연산결과가 참일 때 수행될 문장 (처음 한번은 무조건 실행된다.)
//        } while (조건식);
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1~100 사이의 정수 입력");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수 필요");
            } else if (input < answer) {
                System.out.println("더 큰 수 필요");
            }
        } while (input != answer);

        System.out.println("정답");
    }
}

