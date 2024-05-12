package ArrayStudy;

public class Array02 {
    public static void main(String[] args) {
        // 총합, 평균
        int sum = 0;
        double avg = 0f;

        int[] score = {100, 88, 100, 100, 90};

//        for (int i = 0; i < score.length; i++) {
//            sum += score[i];
//        }

        // 향상된 for문으로 바꾸기
        for (int scores : score) {
            sum += scores;
        }

        // 총합을 배열의 길이로 나눈다.
        avg = sum / (double) score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
