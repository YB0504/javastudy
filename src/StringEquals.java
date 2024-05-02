public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = str1;

        // "==" 연산자를 이용한 참조 비교\
        System.out.println("== 연산자 이용");
        System.out.println("str1 == str2 : " + (str1 == str2));   // false(서로 다른 객체)
        System.out.println("str1 == str3 : " + (str1 == str3));   // true(서로 같은 객체)

        // "equals()" 메소드를 이용한 내용 비교
        System.out.println("\nequals() 이용");

        // 모두 true 내용이 일치한다.
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
    }
}
