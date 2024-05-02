public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // 삼항 연산자(조건 연산자)
        // 조건식이 참이면 a 거짓이면 b
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

        int num = -10;
        String result = (num >= 0) ? "양수" : "음수";
        System.out.println(result);

        double x = 3.14;
        double y = 2.71;
        double maxDouble = (x > y) ? x : y;
        System.out.println("maxDouble = " + maxDouble);
    }
}
