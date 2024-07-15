package Generics;

import java.util.ArrayList;
import java.util.List;

interface GenericsEx08 {
}

interface GenericsExtends{
}

class BoxType implements GenericsEx08, GenericsExtends {
}

class Box<T extends GenericsEx08 & GenericsExtends> {
    List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public static void main(String[] args) {
        // 두 인터페이스를 동시에 구현한 클래스만 타입 할당이 가능
        Box<BoxType> box = new Box<>();

        // 최상위인 Object 클래스 조차 할당이 불가능
//        Box<Object> box2 = new Box<>(); // Error
    }
}

