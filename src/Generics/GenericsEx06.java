package Generics;

public class GenericsEx06<T extends Number> {
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}

    public static void main(String[] args) {
        // ���׸��� Number Ŭ���� ���� Ÿ�Ը� ���� �� �ִ�.
        GenericsEx06<Number> cal1 = new GenericsEx06<>();
        GenericsEx06<Integer> cal2 = new GenericsEx06<>();
        GenericsEx06<Double> cal3 = new GenericsEx06<>();

        // Number Ŭ���� �̿��� Ŭ������ ������ �������� ������ �߻��Ѵ�.
//        GenericsEx06<Object> cal4 = new GenericsEx06<>();
//        GenericsEx06<String> cal5 = new GenericsEx06<>();
    }
}
