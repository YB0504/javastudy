import java.util.Scanner;

public class BJ01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력");

        System.out.println("1번");
        int A = sc.nextInt();
        System.out.println("2번");
        int B = sc.nextInt();
        System.out.println("3번");
        int C = sc.nextInt();

        System.out.println((A + B) % C);
        System.out.println((A % C) + (B % C) % C);
        System.out.println((A * B) % C);
        System.out.println((A % C) * (B % C) % C);
    }
}
