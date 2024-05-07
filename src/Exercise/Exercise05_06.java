package Exercise;

import java.util.Scanner;

public class Exercise05_06 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // String을 char[]로 변환
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                // char[]에 저장된 단어를 무작위로 섞는다.
                int idx = (int) (Math.random() * question.length);

                char tmp = question[i];
                question[i] = question[idx];
                question[idx] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요>", i + 1, new String(question));

            String answer = scanner.nextLine();

            // 입력한 답을 정확히 비교하기 위해 trim()로 공백을 제거한다.
            if (words[i].equals(answer.trim())) {
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }
        }
    }
}
