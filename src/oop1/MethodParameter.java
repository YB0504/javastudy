package oop1;

class Data {
    int x;
}

class Data2 {
    int x;
}

public class MethodParameter {
    public static void main(String[] args) {
        System.out.println("기본형 매개변수");
        Data data = new Data();
        data.x = 10;
        System.out.println("main() : x = " + data.x);

        change(data.x);
        System.out.println("Call change(data.x)");
        System.out.println("main() : x = " + data.x);


        System.out.println("\n참조형 매개변수");
        Data2 data2 = new Data2();
        data2.x = 10;
        System.out.println("main() : x = " + data2.x);

        changeValue(data2);
        System.out.println("Call change(data2)");
        System.out.println("main() : x = " + data2.x);
    }

    static void change(int x) {
        // 기본형 매개변수는 값을 읽기만 할 뿐 변경할 수는 없다.
        x = 1000;

        System.out.println("change() : x = " + x);
    }

    static void changeValue(Data2 data2) {
        // 참조형 매개변수는 값을 읽어오고 변경도 할 수 있다.
        data2.x = 1000;
        System.out.println("change() : x = " + data2.x);
    }
}
