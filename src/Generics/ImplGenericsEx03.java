package Generics;

public class ImplGenericsEx03 {
    public static void main(String[] args) {
        // ���׸��� ���� ���� �Լ��� Ÿ���� ����
        GenericsEx03<Integer> o = (x, y) -> x + y;
        // �Ű����� x�� y �׸��� ��ȯ�� Ÿ���� int������ ����

        int result = o.add(10, 20);
        System.out.println(result);
    }
}
