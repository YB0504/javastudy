public class SignOperator {
    public static void main(String[] args) {
        int number = 10;

        // number의 부호 변경
        int oppositeNumber = -number;
        System.out.println("number의 원래 부호 : " + number);            // 10
        System.out.println("부호 바꾸기 -number : " + oppositeNumber);   // -10

        int number1 = -10;
        oppositeNumber = -number1;
        System.out.println("number1의 원래 부호 : " + number1);          // -10
        System.out.println("부호 바꾸기 -number : " + oppositeNumber);   // 10
    }
}
