package Generics;

public class GenericsEx04<T> {

    // Ŭ������ Ÿ�� �Ķ���͸� �޾ƿ� ����ϴ� �Ϲ� �޼ҵ�
    public T addBox(T x, T y) {
        return null;
    }

    // ���������� Ÿ���� �Ҵ�, ��Ǵ� ���׸� �޼ҵ�
    public static <T> T addBoxStatic(T x, T y) {
        return null;
    }

    public static void main(String[] args) {
        // �Ű� ������ �ڷ����� ���� Ÿ���� �߷��Ͽ� ���׸� Ÿ���� ������ �����ϴ�.
        GenericsEx04.addBoxStatic(1, 2);
    }
}
