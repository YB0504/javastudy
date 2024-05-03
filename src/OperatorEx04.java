import java.util.Scanner;

public class OperatorEx04 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a | b) {
            System.out.println(true);
        }

        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft);

        int value1 = 356;
        System.out.println((value1 / 100) * 100);

        float f1 = 10f;
        float f2 = f1 / 100;
        if (f2 == 0.1f) {
            System.out.println("10%");
        } else {
            System.out.println("!10%");
        }

        int top = 5;
        int bottom = 10;
        int h = 7;
        double area = (double) (top + bottom) * h / 2;
        System.out.println(area);

        int var1 = 10;
        int var2 = 3;
        int var3 = 14;
        double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
        System.out.println(var4);

        Scanner sc = new Scanner(System.in);
        System.out.println("ID");
        String name = sc.nextLine();

        System.out.println("PW");
        String strPW = sc.nextLine();
        int pw = Integer.parseInt(strPW);

        if (name.equals("java")) {
            if (pw == 12345) {
                System.out.println("Success");
            } else {
                System.out.println("Fail");
            }
        } else {
            System.out.println("!ID");
        }

        int score = 85;
        String result = (!(score > 90)) ? "가" : "나";
        System.out.println(result);

        int i1 = 10;
        int i2 = 10;
        String s1 = "AB";
        String s2 = "AB";
        String s3 = new String("AB");
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(s1 == s2);
        System.out.println(s1 != s3);
        System.out.println(s2.equals(s3));
    }
}
