public class autoCasting {
    public static void main(String[] args) {

        // 1. int -> double
        int i1 = 10;
        System.out.println(i1);
        double d1 = i1;
        System.out.println(d1);
        // 자동형변환 int => double
        // int형을 더 큰 그릇인 double형 변수에 담으면서 자동형변환 된다.

        // 2. int => long
        int i2 = 1200000;
        long l3 = i2;
        System.out.println(l3);

        // 특이케이스 1. long => float
        // 정수 => 실수 변환시, 큰 정수가 작은 실수에 대입 가능
        // float이 long보다 근사값을 더 넓게 구할 수 있다.
        long l4 = 1000000L;
        float f5 = l4;
        System.out.println("f5 : " + f5);

        // 특이케이스 2. char <=> int
        // 아스키코드를 이용
        char ch1 = 98;
        char ch2 = 'b';
        // char + string + char => string + string + string으로 인식한다.
        System.out.println(ch1 + " is " + ch2 + " ?");

        int num = ch1;
        System.out.println(num);

        System.out.println('b');                // b
        System.out.println((int) 'b');          // 98
        System.out.println('b' + 2);            // char + int => int 100
        System.out.println('b' + (char) '2');   // char + char > int 100
        System.out.println((char) 2);           // STX문자의 아스키코드값인 2이지만 특정한 출력이 나타나지 않는다.

        // char 2를 int형으로 변환시 아스키값인 50으로 변환된다.
        // 고로 2 + 50인 52가 출력
        System.out.println((char) 2 + (char) '2');

        // 특이케이스 3. byte, short간의 연산
        // -128 ~ 127
        byte b1 = 126;
        byte b2 = 2;
        System.out.println(b1 + b2);
        // 결과값이 int형 => cpu가 값을 처리하는 기본크기가 int형의 크기

        byte b3 = (byte)128;
        // byte 범위를 넘는 값을 byte에 넣었기 때문에 오버플로우 발생
        System.out.println(b3);
    }
}
