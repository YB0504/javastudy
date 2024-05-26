package Exercise;

import java.util.Scanner;

public class ExerciseException04 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.print("1 ~ 100 사이의 값 입력 :");

//            input = new Scanner(System.in).nextInt();

            // 숫자이외의 값이 입력되어도 프로그램이 종료되지 않도록
            // catch문에서 continue문을 사용한다.
            try {
                input = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("숫자만 입력하세요");
                continue;
            }

            if (answer > input) {
                System.out.println("더 큰 수");
            } else if (answer < input) {
                System.out.println("더 작은 수");
            } else {
                System.out.println("정답");
                System.out.println("시도횟수 : " + count + "번");
                break;
            }
        } while (true);
    }
}
