package ifStudy;

public class if01 {
    public static void main(String[] args) {
        int score = 80;

        // if Remind 시작
        // JAVA에서 가장 기본적인 조건문이다.
        // 조건식의 내용이 true면 아래의 코드를 출력한다.
        if (score > 60) {
            System.out.println("합격");
        }

        // if문 내부의 문장이 하나인 경우 {}가 생략되기도 한다.
        if (score >=70) System.out.println("70이상 합격");
    }
}
