public class StringEqual {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc"=="abc");
        System.out.printf("str1 == \"abc\" ? %b%n", str1=="abc");
        // str2와 abc가 값이 같은데 false가 나오는 이유는 서로 다른 객체이기 떄문
        System.out.printf("str2 == \"abc\" ? %b%n", str2=="abc");
        System.out.println(str1.equals("abc"));
        // equals()를 사용하면 객체가 달라도 내용이 같으면 true를 반환한다.
        System.out.println(str2.equals("abc"));
        // 대소문자 구분 없이 비교하고 싶을 때 사용하는 메소드
        System.out.println(str2.equalsIgnoreCase("ABC"));
    }
}
