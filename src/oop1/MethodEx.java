package oop1;

public class MethodEx {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long result1 = myMath.add(5l, 3l);
        long result2 = myMath.subtract(5l, 3l);
        long result3 = myMath.multiply(5l, 3l);
        double result4 = myMath.divide(5l, 3l);     // double형으로 자동 형변환

        System.out.println("add(5l, 3l) = "+result1);
        System.out.println("subtract(5l, 3l) = "+result2);
        System.out.println("multiply(5l, 3l) = "+result3);
        System.out.println("divide(5l, 3l) = "+result4);
    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long subtract(long a, long b) {
        // 간단한 메소드의 경우 이런 방식으로 간단히 할 수도 있다.
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
