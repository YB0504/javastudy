public class hashCode {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // StringBuilder로 감싼 "Hello"와 리터럴로 선언한 Hello의
        // 해시코드 값이 다른 이유는?
        // sb는 객체의 내용을 기반으로 해시코드가 계산되고, 리터럴은 상수 풀에서 관리된다.
        System.out.println("sb.hashCode() = "+sb.hashCode());
        System.out.println("Hello.hashCode() = "+"Hello".hashCode());

        if (sb.hashCode() == "Hello".hashCode()) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
    }
}
