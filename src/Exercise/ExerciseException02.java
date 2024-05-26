package Exercise;

public class ExerciseException02 {

    static void method01() {
        try {
            method02();
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    }

    static void method02() {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        try {
            method01();
        } catch (Exception e) {
            System.out.println(5);
        }
    }
}
