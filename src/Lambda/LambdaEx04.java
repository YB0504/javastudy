package Lambda;

interface IAdd02 {
    int add(int x, int y);
}

public class LambdaEx04 {
    public static void main(String[] args) {
        IAdd02 lambda = (x, y) -> x + y;
        System.out.println(lambda);

        // Object 타입으로 업캐스팅 하기 위해서는 두 번의 캐스팅이 필요하다.
        Object lambdaObj = (Object) (IAdd02) ((x, y) -> x + y);
        System.out.println(lambdaObj);
    }
}
