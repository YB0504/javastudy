public class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void foo() {
        if (this instanceof InterfaceA) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        InterfaceA a = new MyClass();
        InterfaceB b = new MyClass();

        a.foo();
        b.foo();

    }
}
