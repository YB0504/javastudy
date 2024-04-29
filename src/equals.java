public class equals {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");

        Object o1 = new Object();
        Object o2 = new Object();

        String s3 = "java";
        String s4 = "java";

        // == : 동일성 비교, 비교하는 서로가 완전히 같은지 비교
        // equals() : 동등성 비교, 서로가 논리적으로 같은지 비교
        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(o1.equals(o2));  // false

        // Literal로 비교하는 경우 두 가지 모두 true값이 리턴
        // 문자열 풀에서 이미 같은 값을 참조하고 있기 때문
        System.out.println(s3 == s4);       // true
        System.out.println(s3.equals(s4));  // true
    }
}
