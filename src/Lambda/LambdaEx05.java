package Lambda;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx05 {
    static void execute(MyFunction myFunction) {
        myFunction.run();
    }

    static MyFunction getMyFunction() {
        MyFunction myFunction = () -> System.out.println("f3.run()");
        return myFunction;
    }

    public static void main(String[] args) {
        // ���ٽ����� run() ����
        MyFunction f1 = () -> System.out.println("f1.run()");

        // �͸� Ŭ������ run() ����
        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}
