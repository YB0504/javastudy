public class Child extends Parent{
    Child(){
        // 상속 받은 부모클래스의 생성자를 반드시 super로 호출해줘야 한다.
        // 매개변수가 있을 시 매개변수 타입에 맞는 값도 할당한다.
        // 안하면 컴파일 오류가 발생
        super(5);
    }
}
