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
        // �� �������̽��� ���ÿ� ������ Ŭ������ Ÿ�� �Ҵ��� ����
        Box<BoxType> box = new Box<>();

        // �ֻ����� Object Ŭ���� ���� �Ҵ��� �Ұ���
//        Box<Object> box2 = new Box<>(); // Error
    }
}

