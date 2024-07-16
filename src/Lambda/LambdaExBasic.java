package Lambda;

interface Calculator {
    int cal(int num1, int num2);
}

public class LambdaExBasic {
    public static void main(String[] args) {
        // 1. �⺻ ���� : (�Ű����� Ÿ��) -> {};
        Calculator cal1 = (int num1, int num2) -> {
            return num1 + num2;
        };
        System.out.println(cal1.cal(1, 2));

        // 2. �Ű����� Ÿ�� ���� : (�Ű�����) -> {};
        Calculator cal2 = (num1, num2) -> {
            return num1 + num2;
        };
        System.out.println(cal2.cal(1, 2));

        // 3. �Ű������� ���� ��� : () -> {};
//        Calculator cal3 = () -> {
//            System.out.println("�Ű����� ����");
//        };
//        cal3.cal();

        // 4. �߰�ȣ ���� : () -> ;
        Calculator cal4 = (num1, num2) -> num1 + num2;
        System.out.println(cal4.cal(1, 2));

        // 5. �Ұ�ȣ ���� : �Ű����� -> ;
//        Calculator cal5 = num1 -> num1 - 1;
//        System.out.println(cal5.cal(1));
    }
}
