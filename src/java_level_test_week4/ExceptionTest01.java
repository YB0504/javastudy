package java_level_test_week4;

public class ExceptionTest01 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(1);
                int[] array = new int[3];
                System.out.println(array[3]);
                System.out.println(2);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(3);
                throw new Exception(e);
            }
            System.out.println(4);
        } catch (Throwable e) {
            System.out.println(5);
            throw new RuntimeException(e);
        } finally {
            System.out.println(6);
        }
        // finally로 프로그램을 종료 시켰기 때문에 출력되지 않는다.
        System.out.println(7);
    }
}
