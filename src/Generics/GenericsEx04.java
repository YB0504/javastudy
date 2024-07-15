package Generics;

public class GenericsEx04<T> {

    // 클래스의 타입 파라미터를 받아와 사용하는 일반 메소드
    public T addBox(T x, T y) {
        return null;
    }

    // 독립적으로 타입을 할당, 운영되는 제네릭 메소드
    public static <T> T addBoxStatic(T x, T y) {
        return null;
    }

    public static void main(String[] args) {
        // 매개 변수의 자료형을 보고 타입을 추론하여 제네릭 타입의 생략이 가능하다.
        GenericsEx04.addBoxStatic(1, 2);
    }
}
