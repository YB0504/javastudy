package whileStudy;

public class Continue01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // 3의 배수를 만났을 때 반복문을 빠져나가 버리는 것이 아니라
            // 증감식을 이어나가 다음 숫자도 출력한다.
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
