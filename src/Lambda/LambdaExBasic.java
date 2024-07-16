package Lambda;

interface Calculator {
    int cal(int num1, int num2);
}

public class LambdaExBasic {
    public static void main(String[] args) {
        // 1. 기본 사용법 : (매개변수 타입) -> {};
        Calculator cal1 = (int num1, int num2) -> {
            return num1 + num2;
        };
        System.out.println(cal1.cal(1, 2));

        // 2. 매개변수 타입 생략 : (매개변수) -> {};
        Calculator cal2 = (num1, num2) -> {
            return num1 + num2;
        };
        System.out.println(cal2.cal(1, 2));

        // 3. 매개변수가 없는 경우 : () -> {};
//        Calculator cal3 = () -> {
//            System.out.println("매개변수 없음");
//        };
//        cal3.cal();

        // 4. 중괄호 생략 : () -> ;
        Calculator cal4 = (num1, num2) -> num1 + num2;
        System.out.println(cal4.cal(1, 2));

        // 5. 소괄호 생략 : 매개변수 -> ;
//        Calculator cal5 = num1 -> num1 - 1;
//        System.out.println(cal5.cal(1));
    }
}
