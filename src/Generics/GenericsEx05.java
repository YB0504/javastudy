package Generics;

public class GenericsEx05<T, U> {

    // ���������� ��Ǵ� ���׸� �޼ҵ�
    public <T, U> void printBox(T x, U y) {
        // �Ű� ������ Ÿ�� ���
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericsEx05<Integer, Long> box1 = new GenericsEx05<>();

        // �ν��Ͻ�ȭ�� ������ Ÿ�� �Ķ���� <Integer, Long>
        box1.printBox(1, 1);

        // ���׸� �޼ҵ忡 �ٸ� Ÿ�� �Ķ���͸� �����ϸ� ���������� ���ȴ�.
        box1.<String, Double>printBox("hello", 5.55);
        box1.printBox("hello", 5.55);   // ������ �����ϴ�.
    }
}
