package whileStudy;

import java.util.Scanner;

public class BreakContinue01 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

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

            System.out.println("선택 메뉴 : " + menu);
        }
    }
}
