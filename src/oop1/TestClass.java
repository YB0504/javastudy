package oop1;

class TestClass2 {
    int instanceValue;
    static int classValue;

    void instanceMethod3() {                    // instance method
        System.out.println(instanceValue);      // instance value
        System.out.println(classValue);         // class value
    }

    static void staticMethod3() {               // static method
//        System.out.println(instanceMethod3);    // instance value X
        System.out.println(classValue);         // class value
    }
}

public class TestClass {
    void instanceMethod() {}

    static void staticMethod() {}

    void instanceMethod2() {        // 인스턴스 메소드
        instanceMethod();           // 다른 인스턴스 메소드 호출 가능
        staticMethod();             // static 메소드 호출 가능
    }

    static void staticMethod2() {   // static 메소드
//        instanceMethod();           // 인스턴스 메소드 호출 불가능
        staticMethod();             // static 메소드 호출 가능
    }
}
