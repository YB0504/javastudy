package Generics;

interface GenericsEx07 {
}

// �������̽��� ������ Ŭ����
class Student implements GenericsEx07 {
}

// �ش� �������̽��� ������ Ŭ������ ���׸� ����
class School<T extends GenericsEx07> {
    public static void main(String[] args) {

        // Ÿ�� �Ķ���Ϳ� �������̽��� ������ Ŭ������ �ü� �ְ� �ȴ�.
        School<Student> a = new School<Student>();
    }
}


