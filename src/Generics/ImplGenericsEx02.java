package Generics;

public class ImplGenericsEx02<T> implements GenericsEx02<T> {
    private T[] array;

    public ImplGenericsEx02() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addElement(T t, int index) {
        array[index] = t;
    }

    @Override
    public T getElement(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        ImplGenericsEx02<String> sample = new ImplGenericsEx02<>();
        sample.addElement("This id String", 5);
        sample.getElement(5);
    }
}
