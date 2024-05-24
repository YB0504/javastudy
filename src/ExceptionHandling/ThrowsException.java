package ExceptionHandling;

public class ThrowsException {
    public static void main(String[] args) throws Exception {
        method1();  // 같은 클래스 내의 static멤버이기 때문에 객체 생성 없이 직접 호출 가능
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
