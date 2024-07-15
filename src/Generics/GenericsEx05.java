package Generics;

public class GenericsEx05<T, U> {

    // 독립적으로 운영되는 제네릭 메소드
    public <T, U> void printBox(T x, U y) {
        // 매개 변수의 타입 출력
        System.out.println(x.getClass().getSimpleName());
        System.out.println(y.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericsEx05<Integer, Long> box1 = new GenericsEx05<>();

        // 인스턴스화에 지정된 타입 파라미터 <Integer, Long>
        box1.printBox(1, 1);

        // 제네릭 메소드에 다른 타입 파라미터를 지정하면 독립적으로 운용된다.
        box1.<String, Double>printBox("hello", 5.55);
        box1.printBox("hello", 5.55);   // 생략도 가능하다.
    }
}
