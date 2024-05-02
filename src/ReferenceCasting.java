public class ReferenceCasting {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // car = (Car)fe; 에서 형변환이 생략됨
        // 부모 <- 자손의 경우 형변환 생략 가능
        car = fe;

        // 컴파일 에러 : Car타입의 참조변수로는 water()를 호출할 수 없다.
//        car.water();
        fe2 = (FireEngine) car; // 자손 <- 부모의 경우 형변환 생략 불가
        fe2.water();
    }
}
class Car{
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrr~");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireEngine extends Car{
    void water() {
        System.out.println("water!");
    }
}
