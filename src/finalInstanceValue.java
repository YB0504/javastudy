public class finalInstanceValue {
    // final로 선언한 instance 변수
    private final int value;

    // 생성자를 이용한 final 변수 초기화
    public finalInstanceValue(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        finalInstanceValue example = new finalInstanceValue(10);
        System.out.println("Value : " + example.getValue());
    }
}
