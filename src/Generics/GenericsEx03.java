package Generics;

// 제네릭으로 타입을 받아, 해당 타입의 두 값을 더하는 Interface
interface GenericsEx03<T> {
    public T add(T x, T y);
}
