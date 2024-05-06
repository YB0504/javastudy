package whileStudy;

public class while01 {
    public static void main(String[] args) {
//        while (조건식) {
//            조건식의 연산결과가 참(true)인 동안, 문장이 반복된다.
//            증감식이 필요한 경우 i++과 같은 증감식을 추가한다.
//        }
        int i = 5;
        while (i != 0) {
            i--;
            // 조건식이 평가된 후라서 i가 감소 4부터 시작
            System.out.println(i);
        }
    }
}
