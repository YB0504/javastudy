package java_level_test_week2;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계절 이름을 입력하세요.");
        String season = scanner.nextLine();

        printSeason(season);
    }

    static void printSeason(String season) {
        switch (season) {
            case "봄":
                print("따뜻한 계절입니다.");
                break;
            case "여름":
                print("더운 계절입니다.");
                break;
            case "가을":
                print("시원한 계절입니다.");
                break;
            case "겨울":
                print("추운 계절입니다.");
                break;
            default:
                print("잘못된 입력입니다.");
                break;
        }
    }

    private static void print(String message) {
        System.out.println(message);
    }

}
