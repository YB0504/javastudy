package whileStudy;

import java.util.Scanner;

public class NamingLoop02 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) menu1");
            System.out.println("(2) menu2");
            System.out.println("(3) menu3");

            String str = scanner.nextLine();
            menu = Integer.parseInt(str);

            if (menu == 0) {
                System.out.println("종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("재선택 (종료하려면 0입력)");
                continue;
            }

            for (;;) {
                System.out.println("값 입력(종료:0, 전체 종료: 99");
                str = scanner.nextLine();
                num = Integer.parseInt(str);

                if (num == 0) {
                    break;
                }

                if (num == 99) {
                    break outer;
                }

                switch (menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
    }
}
