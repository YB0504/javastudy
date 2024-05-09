package Exercise;

public class ExerciseFor01 {
    public static void main(String[] args) {
        // 4x + 5y = 60의 모든 x,y 값을 구해서 (x,y)형태로 출력
        // x,y는 10이하의 자연수
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
