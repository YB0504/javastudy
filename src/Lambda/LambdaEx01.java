package Lambda;

interface IAdd {
    int add(int x, int y);
}

public class LambdaEx01 {
    public static void main(String[] args) {
        // ��ȸ�� Ŭ������ �͸� Ŭ������ ����(����X)
        IAdd a = new IAdd() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result2 = a.add(1, 2);
        System.out.println(result2);

        // ���ٽ����� ����
        // ���ٽ� ������ �ݵ�� ;�� �پ�� �Ѵ�.
        IAdd aLambda = (x, y) -> {return x+y;};

        int result3 = aLambda.add(1, 2);
        System.out.println(result3);
    }
}
