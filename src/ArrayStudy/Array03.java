package ArrayStudy;

public class Array03 {
    public static void main(String[] args) {
        // 최대, 최소값
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        // 최대, 최소값을 배열의 0번째 값으로 초기화 했기 때문에
        // 그 다음 요소인 1번부터 비교하기 위해 초기화를 1로 둔다.
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("Max : " +max);
        System.out.println("Min : " +min);
    }
}
