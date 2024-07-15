package Generics;

public class ImplGenericsEx03 {
    public static void main(String[] args) {
        // 제네릭을 통해 람다 함수의 타입을 결정
        GenericsEx03<Integer> o = (x, y) -> x + y;
        // 매개변수 x와 y 그리고 반환형 타입이 int형으로 설정

        int result = o.add(10, 20);
        System.out.println(result);
    }
}
