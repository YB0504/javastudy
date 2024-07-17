package FunctionalInterface;

import java.util.function.*;

public class FunctionalInterfaceEx01 {
    public static void main(String[] args) {

        // 객체 T를 받아 출력하는 함수
        Consumer<String> c1 = t -> System.out.println("입력값 : " + t);
        c1.accept("홍길동");

        // 객체 T와 U를 받아 출력하는 함수
        BiConsumer<String, Integer> c2 = (a, b) -> System.out.println("입력값1 : " + a + ", 입력값2 : " + b);
        c2.accept("홍길동", 100);

        // int 값을 받아 출력하는 함수
        IntConsumer c3 = a -> System.out.println("입력값 : " + a);
        c3.accept(100);

        // double
        DoubleConsumer c4 = a -> System.out.println("입력값 : " + a);
        c4.accept(100.1);

        // long
        LongConsumer c5 = a -> System.out.println("입력값 : " + a);
        c5.accept(2100000000);
    }
}
