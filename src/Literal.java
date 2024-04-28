public class Literal {
    public static void main(String[] args) {
        System.out.println("Hello");

        // 10진수 외에도 2,8,16진수로 표현된 리터럴을 변수에 저장할 수 있다.
        // 16진수를 표현할 때는 '0x'또는 '0X'를 붙이고 8진수는 '0'을 붙인다.
        int octNum = 010; // 8
        int hexNum = 0x10; // 16

        System.out.println(octNum);
        System.out.println(hexNum);

        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        float pi = 3.14f;
        double rate = 1.618d;

        System.out.println(big);
        System.out.println(hex);
        System.out.println(pi);
        System.out.println(rate);
    }
}
