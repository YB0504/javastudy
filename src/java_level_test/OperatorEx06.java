package java_level_test;

public class OperatorEx06 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + ++a * a--;

        System.out.println(a);
        System.out.println(b);
    }

}