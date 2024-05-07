package java_level_test_week1;

public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 30;

        boolean result = a % b == c % b || c % a == b % a;

        System.out.println(result); // (1)
    }
}
