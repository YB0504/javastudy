package Lambda;

interface IAdd01 {
    int add(int x, int y);
}

public class LambdaEx03 {
    public static void main(String[] args) {
        // 함수를 변수에 할당
        IAdd01 lambda = (x, y) -> x + y;
        lambda.add(1, 2);

        // 메소드의 매개변수에 람다식을 전달
        int n = result((x, y) -> x + y);
        System.out.println(n);

        // 메소드의 반환값이 람다식
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
