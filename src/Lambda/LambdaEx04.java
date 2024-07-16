package Lambda;

interface IAdd02 {
    int add(int x, int y);
}

public class LambdaEx04 {
    public static void main(String[] args) {
        IAdd02 lambda = (x, y) -> x + y;
        System.out.println(lambda);

        // Object Ÿ������ ��ĳ���� �ϱ� ���ؼ��� �� ���� ĳ������ �ʿ��ϴ�.
        Object lambdaObj = (Object) (IAdd02) ((x, y) -> x + y);
        System.out.println(lambdaObj);
    }
}
