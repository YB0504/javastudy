public class MathRound {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi1 = Math.round(pi * 1000) / 1000.0;
        double shortPi2 = Math.round(pi * 100) / 100.0;
        double shortPi3 = Math.round(pi * 10) / 10.0;
        System.out.println(shortPi1);
        System.out.println(shortPi2);
        System.out.println(shortPi3);
//        3.142
//        3.14
//        3.1

    }
}
