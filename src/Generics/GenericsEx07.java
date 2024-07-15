package Generics;

interface GenericsEx07 {
}

// 인터페이스를 구현한 클래스
class Student implements GenericsEx07 {
}

// 해당 인터페이스를 구현한 클래스만 제네릭 가능
class School<T extends GenericsEx07> {
    public static void main(String[] args) {

        // 타입 파라미터에 인터페이스를 구현한 클래스만 올수 있게 된다.
        School<Student> a = new School<Student>();
    }
}


