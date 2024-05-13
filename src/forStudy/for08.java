package forStudy;

import java.util.Scanner;

public class for08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= n; j++) {
                System.out.print(j + " * " + i + " = " + (n * i) + "\t");
            }
            System.out.println();
        }
    }
}
