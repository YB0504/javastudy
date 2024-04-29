public class typeChange {
    public static void main(String[] args) {
        String str = "3";

        // 숫자를 문자로
        System.out.println((char) (3 + '0'));               // '3'
        // 문자를 숫자로
        System.out.println('3' - '0' + 1);                  // 4
        // 숫자를 문자열로
        System.out.println("3" + 1);                        // "31"
        // 문자열을 숫자로
        System.out.println(Integer.parseInt("3") + 1);   // 4
        // 문자열을 문자로
        System.out.println(str.charAt(0) - '0');            // 3
        // 문자를 문자열로
        System.out.println('3' + "");                       // "3"
    }
}
