package ArrayStudy;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            // numArr[0]의 값을 tmp에 저장
            int tmp = numArr[0];
            // numArr[n]의 값을 numArr[0]에 저장
            numArr[0] = numArr[n];
            // tmp값을 numArr[n]에 저장
            numArr[n] = tmp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
