package oop1;

public class MethodCall {
    public static void main(String[] args) {
        Math math = new Math();
        int result = math.add(3, 5);
        // 리턴 타입이 void가 아닌 경우, 대입 연산자로 변수에 저장하는 과정을 생략할 수 있다.
        math.add(4, 5);
//        int result1 = math.add(1, 2, 3);    // 에러, 메소드에 선언된 매개변수의 개수가 다름
//        int result2 = math.add(1.0, 2.0);   // 에러, 메소드에 선언된 매개변수의 타입이 다름
    }

    static class Math {
        int add(int x, int y) {
            int result = x + y;

            return result;
        }
    }
}
