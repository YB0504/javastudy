package ArrayStudy;

import java.util.Arrays;

public class Array05 {
    public static void main(String[] args) {
        int[] lotto = new int[45];

        // 배열[0]방 부터 1 ~ 45의 숫자를 미리 저장해두기 때문에
        // 중복 값이 출력되는 것을 피할 수 있다.
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
        }

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            // [i]와 [j]의 값을 서로 바꾼다.
            tmp = lotto[i];
            lotto[i] = lotto[j];
            lotto[j] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("lotto[" + i + "] = " + lotto[i]);
        }

        System.out.println(Arrays.toString(lotto));
    }
}
