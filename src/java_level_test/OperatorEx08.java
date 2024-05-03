package java_level_test;

public class OperatorEx08 {
    public static void main(String[] args) {
        // 다음 코드를 실행하여 출력되는 결과를 작성하세요.
        boolean a = true;
        boolean b = false;

        boolean result = (!a && b) || ((a || b) && (a && !b));

        System.out.println(result); // (1)

    }
}
