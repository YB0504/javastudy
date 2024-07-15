package Generics;

public class GenericsEx06<T extends Number> {
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}

    public static void main(String[] args) {
        // 제네릭의 Number 클래스 하위 타입만 받을 수 있다.
        GenericsEx06<Number> cal1 = new GenericsEx06<>();
        GenericsEx06<Integer> cal2 = new GenericsEx06<>();
        GenericsEx06<Double> cal3 = new GenericsEx06<>();

        // Number 클래스 이외의 클래스는 컴파일 과정에서 오류가 발생한다.
//        GenericsEx06<Object> cal4 = new GenericsEx06<>();
//        GenericsEx06<String> cal5 = new GenericsEx06<>();
    }
}
