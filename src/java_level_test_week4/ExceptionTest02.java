package java_level_test_week4;

class MyException1 extends Exception {

}

class MyException2 extends RuntimeException {

}

public class ExceptionTest02 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(0);
            method1();
            System.out.println(1);
            throw new MyException1();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(2);
        }
    }

    private static void method1() {
        try {
            System.out.println(3);
            method2();
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5);
            e.printStackTrace();
            System.out.println(6);
        } finally {
            System.out.println(7);
        }
    }

    private static void method2() {
        System.out.println(8);
        method3();
        System.out.println(9);
    }

    private static void method3() {
        System.out.println(10);
        throw new MyException2();
    }
}
