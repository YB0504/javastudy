package FunctionalInterface;

import java.util.function.IntBinaryOperator;

class Operation {
    static int calculate(int[] arr, IntBinaryOperator intBinaryOperator) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = intBinaryOperator.applyAsInt(result, arr[i]);
        }

        return result;
    }
}

public class FunctionalInterfaceEx04 {
    public static void main(String[] args) {

        int[] numbers = {3, 1, 7, 6, 5};

        // 배열 요소의 합
        int sum = Operation.calculate(numbers, (x, y) -> {
            return x + y;
        });
        System.out.println(sum);

        // 곱
        int mul = Operation.calculate(numbers, (x, y) -> {
            return x * y;
        });
        System.out.println(mul);

        // 가장 큰수
        int max = Operation.calculate(numbers, (x, y) -> {
            int tmp;

            if (x > y) {
                tmp = x;
            } else {
                tmp = y;
            }

            return tmp;
        });
        System.out.println(max);

        // 가장 작은 수
        int min = Operation.calculate(numbers, (x, y) -> {
            int tmp;

            if (x < y) {
                tmp = x;
            } else {
                tmp = y;
            }

            return tmp;
        });
        System.out.println(min);
    }
}
