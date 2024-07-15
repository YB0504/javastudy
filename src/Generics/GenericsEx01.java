package Generics;

class Sample<T> {
    // ��� ���� val�� Ÿ�� T
    private T value;

    // T Ÿ���� �� val�� ��ȯ�Ѵ�.
    public T getValue() {
        return value;
    }

    // T Ÿ���� ���� ��� ���� val�� �����Ѵ�.
    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericsEx01 {
    public static void main(String[] args) {
        // ������ ���׸� Ŭ����
        Sample<Integer> s1 = new Sample<>();
        s1.setValue(1);

        // �Ǽ��� ���׸� Ŭ����
        Sample<Double> s2 = new Sample<>();
        s2.setValue(1.0);

        // ���ڿ� ���׸� Ŭ����
        Sample<String> s3 = new Sample<>();
        s3.setValue("1");

        System.out.println(s1.getValue());
        System.out.println(s2.getValue());
        System.out.println(s3.getValue());
    }
}
