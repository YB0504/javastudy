package Exercise;

public class ExerciseException06 {
    public static void main(String[] args) {
        try {
            method1();              // main()에서 method1()을 호출, 예외 발생!
            System.out.println(6);  // 실행 X
        } catch (Exception e) {
            System.out.println(7);
        }
    }

    static void method1() throws Exception {
        try {
            method2();                      // method1()에서 method2()를 호출, 예외 발생!
            System.out.println(1);          // 실행 X
        } catch (NullPointerException e) {
            System.out.println(2);          // method2()에서 받는 예외와 맞는 catch구문 실행
            throw e;                        // 예외 되던지기
        } catch (Exception e) {
            System.out.println(3);
        } finally {                         // finally는 예외와 상관 없이 실행
            System.out.println(4);
        }
        System.out.println(5);
    }

    static void method2() {
        throw new NullPointerException();
    }
}
