package ifStudy;

import java.util.Scanner;

public class ifElseIf02 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.println("점수 입력");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.println("점수 : " + score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.println("학점 : " + grade + opt);
    }
}
