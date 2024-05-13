package java_level_test_week2;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        // 다음의 배열을 [5, 1, 2, 3, 4]로 만들기
        // 모든 요소를 오른쪽으로 한 칸씩 이동
        int[] array = {1, 2, 3, 4, 5};

        shiftRight(array);

        System.out.println(Arrays.toString(array));
    }

    private static void shiftRight(int[] array) {
        // index4번의 값을 미리 복사해둔다.
        int temp = array[4];

        // i가 0이 되기 전까지 배열의 길이-1만큼 루프를 돌면서
        // 각 배열의 값을 복사한다.
        // -1의 이유는 length와 index는 -1차이가 난다.
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        // index 0번방에 복사해둔 index 4번의 값을 집어넣는다.
        array[0] = temp;
    }
}
