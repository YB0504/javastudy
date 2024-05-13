package ifStudy;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();

        if ((i1 + i2) % 3 == 0 && (i1 + i2) % 6 == 0) {
            System.out.println(i1 + "와(과)" + i2 + " 는 3과 6의 배수");
        } else {
            System.out.println(i1 + "와(과)" + i2 + " 는 3과 6의 배수가 아니다.");
        }
    }
}
