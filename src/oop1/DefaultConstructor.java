package oop1;

//    클래스 이름(타입 변수명, 타입 변수명, ...){
//        인스턴스 생성시 수행될 코드
//        주로 인스턴스 변수의 초기화 코드를 적는다.
//    }
class Data_1{
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) {     // 매개 변수가 있는 생성자
        value = x;
    }
}


public class DefaultConstructor {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
//        Data_2 d2 = new Data_2();   // error
        // 생성자에 매개변수가 있다면 생성자를 호출할 때
        // 매개변수에 맞는 값도 설정해줘야 한다.
    }
}
