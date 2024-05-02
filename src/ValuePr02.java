public class ValuePr02 {
    // 전역 변수 : 인스턴스마다 개별적으로 메모리 공간을 할당받는다,
    String name;
    int age;

    // 클래스 변수 : 클래스 내 모든 인스턴스가 공유하는 메모리 공간을 사용한다.
    static int numberOfCats = 0;

    public ValuePr02(String name, int age) {
        // 지역 변수 : 해당 메소드 내에서만 사용 가능하며, 메소드가 종료되면 메모리에서 해제된다.
        String nickname = "Cat";
        this.name = name;
        this.age = age;
        numberOfCats++; // 클래스 변수는 인스턴스 생성 시마다 증가한다.
    }

    public void meow() {
        System.out.println(name + " is meow!");
    }

    public static void main(String[] args) {
        ValuePr02 cat1 = new ValuePr02("Luna", 3);
        ValuePr02 cat2 = new ValuePr02("Tiger", 5);

        // 클래스 변수는 모든 인스턴스에서 공유되므로 두번 증가하여 2가 된다.
        System.out.println("Number Of Cats : " + numberOfCats);

        cat1.meow();
        cat2.meow();
    }
}
