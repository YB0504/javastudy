package java_level_test;

public class OperatorEx09 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int result = a > b ? (b > c ? b : c) : (a < c ? a : c);

        System.out.println(result); // (1)

    }
}
