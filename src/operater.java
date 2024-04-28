import java.util.Scanner;

public class operater {
    public static void main(String[] args) {
        // 부호 연산자(-)
        int i = -10;
        i = +i;
        // 부호연산자로서 +는 하는 일이 없다.

        System.out.println(i);

        i = -i;
        System.out.println(i);

        // 논리 연산자
        // ||(OR), &&(AND)
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");

        int x = sc.nextInt();
        if (x > 1 && x < 10) {
            System.out.println("성공1");
        } else {
            System.out.println("1보다 작거나 10임");
        }

        int y = sc.nextInt();
        if ((y > 10 && y < 20) || (y > 21 && y < 30)) {
            System.out.println("성공2");
        } else {
            System.out.println("20이거나 30임");
        }
    }
}
