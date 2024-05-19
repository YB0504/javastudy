package oop2;

class ParentSuper {
    int x = 10;
}

class ChildSuper extends ParentSuper {
    int x = 20;

    void Method() {
        System.out.println("x = " + x);             // 20
        System.out.println("this.x = " + this.x);   // 20
        System.out.println("super.x = " + super.x); // 10
    }
}

public class SuperValue {
    public static void main(String[] args) {
        ChildSuper childSuper = new ChildSuper();
        childSuper.Method();
    }
}
