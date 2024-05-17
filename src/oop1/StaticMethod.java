package oop1;

class MyMath2 {
    // 인스턴스 변수
    long a, b;

    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add(){
        return a + b;
    }

    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    // 여기서 a, b는 지역변수
    static long add(long a, long b) {
        return a + b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 클래스 메소드 호출, 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200l, 300l));

        // 인스턴스 생성
        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 200l;
        myMath2.b = 100l;

        // 인스턴스 메소드는 객체 생성 후에만 호출 가능
        System.out.println(myMath2.add());
    }
}
