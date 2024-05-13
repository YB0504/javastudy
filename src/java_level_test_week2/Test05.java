package java_level_test_week2;

public class Test05 {
    public static void main(String[] args) {
        // 출력 결과 = 0;
        // 이유
        // found 변수가 이미 true로 초기화 되어있기 때문에
        // while의 루프가 한번도 실행되지 않으므로 i값은 초기값인 0그대로이다.
        int[] numbers = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        int target = 7;
        int i = 0;
        boolean found = true;

        while (i < numbers.length && !found) {
            if (numbers[i] == target) {
                found = true;
            } else {
                i++;
            }
        }
        System.out.println(i);
    }
}
