package oop2;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    void parentMethod() {}

    void parentMethod(int i) {
        // 오버로딩
    }

    void childMethod(){}
    void childMethod(int i){
        // 오버 로딩
    }
}
