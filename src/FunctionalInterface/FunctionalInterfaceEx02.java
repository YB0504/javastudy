package FunctionalInterface;

import java.util.function.*;

public class FunctionalInterfaceEx02 {
    public static void main(String[] args) {

        // T 객체를 리턴하는 함수
        Supplier<Object> supplier = () -> new Object();
        System.out.println(supplier.get());

        // Boolean 값을 리턴하는 함수
        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        // Int 값을 리턴하는 함수
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };
        System.out.println("랜덤 주사위 : " + intSupplier.getAsInt());

        // Double
        DoubleSupplier doubleSupplier = () -> 1.0;
        System.out.println(doubleSupplier.getAsDouble());

        // long
        LongSupplier longSupplier = () -> 1L;
        System.out.println(longSupplier.getAsLong());
    }
}
