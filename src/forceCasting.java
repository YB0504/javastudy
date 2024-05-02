public class forceCasting {
    public static void main(String[] args) {
        // 명시적 형변환이라고도 한다.
        // (변환할 자료형)값;

        double d2 = 8.0;
        float f1 = (float) d2;
        System.out.println(f1);

        double d3 = 10.123123;
        int i4 = (int) d3;
        System.out.println(i4);

        int iNum = 10;
        double dNum1 = 1.56;
        double dNum2 = 0.57;

        // BigDecimal
        System.out.println(iNum + dNum1);
        System.out.println(dNum1 + dNum2);
        System.out.println((int) (dNum1 + dNum2));

        char ch1 = 98;
        char ch2 = 'b';
        System.out.println(ch1 + " is " + " ?");

        System.out.println('b');                // b
        System.out.println((int) 'b');          // 98
        System.out.println('b' + 2);            // char + int => int 100
        System.out.println('b' + (char) '2');   // char + char > int 100
        System.out.println((char) 2);           // STX문자의 아스키코드값인 2이지만 특정한 출력이 나타나지 않는다.

        // char 2를 int형으로 변환시 아스키값인 50으로 변환된다.
        // 고로 2 + 50인 52가 출력
        System.out.println((char) 2 + (char) '2');
    }
}
