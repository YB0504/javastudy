public class IncrementDecrementOper {
    public static void main(String[] args) {
        int x = 5;

        x++;
        System.out.println("x값 증가 후 : " + x);

        x--;
        System.out.println("x값 감소 후 : " + x);

        // 증가 연산자
        System.out.println("증가 연산자");
        System.out.println("전위 증가 연산자 사용 전 x = " + x);
        System.out.println("전위 증가 연산자 사용 후 ++x = " + ++x);
        System.out.println("후위 증가 연산자 사용 전 x = " + x);
        System.out.println("후위 증가 연산자 사용 x++ = " + x++);
        System.out.println("후위 증가 연산자 사용 후 x++ = " + x++);
        
        // 감소 연산자
        System.out.println("                                  ");
        System.out.println("감소 연산자");
        System.out.println("전위 감소 연산자 사용 전 x = " + x);
        System.out.println("전위 감소 연산자 사용 후 --x = " + --x);
        System.out.println("후위 감소 연산자 사용 전 x = " + x);
        System.out.println("후위 감소 연산자 사용 x-- = " + x--);
        System.out.println("후위 감소 연산자 사용 후 x-- = " + x--);


    }
}
