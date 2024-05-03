package java_level_test;

public class OperatorEx05 {
    public static void main(String[] args) {
        int a = 3;
        a = a + 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        int x = 10;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        int a1 = 100;
        double b1 = 20.5;
        byte c1 = 3;
        b1 = a1 / (int) b1;
        System.out.println(b1 * c1);

        double a2 = 15.5;
        int b2 = 10;
        byte c2 = 2;
        System.out.println(((int) a2 / b2) * c2);
    }
}
