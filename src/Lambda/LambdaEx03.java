package Lambda;

interface IAdd01 {
    int add(int x, int y);
}

public class LambdaEx03 {
    public static void main(String[] args) {
        // �Լ��� ������ �Ҵ�
        IAdd01 lambda = (x, y) -> x + y;
        lambda.add(1, 2);

        // �޼ҵ��� �Ű������� ���ٽ��� ����
        int n = result((x, y) -> x + y);
        System.out.println(n);

        // �޼ҵ��� ��ȯ���� ���ٽ�
        IAdd01 func = makeFunction();
        int result1 = func.add(1, 2);
        System.out.println(result1);
    }

    public static int result(IAdd01 lambda) {
        return lambda.add(1, 2);
    }

    public static IAdd01 makeFunction() {
        return (x, y) -> x + y;
    }
}
