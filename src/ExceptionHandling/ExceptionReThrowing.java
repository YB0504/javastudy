package ExceptionHandling;

public class ExceptionReThrowing {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("메인 메소드에서 예외 처리");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외 처리");
            throw e;
        }
    }
}
