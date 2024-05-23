package ExceptionHandling;

public class TryCatch03 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0 / 0);
            // 고의로 예외를 발생시켰기 때문에 실행되지 않는다.
            System.out.println(2);
        } catch (Exception e) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
