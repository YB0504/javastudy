package FunctionalInterface;

import java.util.function.*;

public class FunctionalInterfaceEx01 {
    public static void main(String[] args) {

        // ��ü T�� �޾� ����ϴ� �Լ�
        Consumer<String> c1 = t -> System.out.println("�Է°� : " + t);
        c1.accept("ȫ�浿");

        // ��ü T�� U�� �޾� ����ϴ� �Լ�
        BiConsumer<String, Integer> c2 = (a, b) -> System.out.println("�Է°�1 : " + a + ", �Է°�2 : " + b);
        c2.accept("ȫ�浿", 100);

        // int ���� �޾� ����ϴ� �Լ�
        IntConsumer c3 = a -> System.out.println("�Է°� : " + a);
        c3.accept(100);

        // double
        DoubleConsumer c4 = a -> System.out.println("�Է°� : " + a);
        c4.accept(100.1);

        // long
        LongConsumer c5 = a -> System.out.println("�Է°� : " + a);
        c5.accept(2100000000);
    }
}
