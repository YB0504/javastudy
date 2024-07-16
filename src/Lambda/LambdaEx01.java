package Lambda;

interface IAdd {
    int add(int x, int y);
}

public class LambdaEx01 {
    public static void main(String[] args) {
        // 일회용 클래스를 익명 클래스로 정의(람다X)
        IAdd a = new IAdd() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result2 = a.add(1, 2);
        System.out.println(result2);

        // 람다식으로 함축
        // 람다식 끝에는 반드시 ;이 붙어야 한다.
        IAdd aLambda = (x, y) -> {return x+y;};

        int result3 = aLambda.add(1, 2);
        System.out.println(result3);
    }
}
