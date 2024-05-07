package java_level_test_week1;

public class OperatorEx07 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 0;

        c = ++a;
        c += b--;
        c *= a--;
        c -= --b;
        c /= ++a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
