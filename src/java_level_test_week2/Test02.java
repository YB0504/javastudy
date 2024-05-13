package java_level_test_week2;

public class Test02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 공배수를 구하는 조건식이 먼저와야지만
            // 각 수의 배수를 구하는 조건식도 코드를 실행할 수 있다.
            if (i % 3 == 0 && i % 5 == 0) {
                print("FizzBuzz");
            } else if (i % 3 == 0) {
                print("Fizz");
            } else if (i % 5 == 0) {
                print("Buzz");
            } else {
                print(i);
            }
        }
    }

    private static void print(Object value) {
        System.out.println(value);
    }
}
