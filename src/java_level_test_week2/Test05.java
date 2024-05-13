package java_level_test_week2;

public class Test05 {
    public static void main(String[] args) {
        // 출력 결과 = 3;
        int[] numbers = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        int target = 7;
        int i = 0;
        boolean found = false;

        while (i < numbers.length && !found) {
            if (numbers[i] == target) {
                found = true;
            } else {
                i++;
            }
        }
        // i가 1씩 더해진다.
        System.out.println(i);
    }
}
