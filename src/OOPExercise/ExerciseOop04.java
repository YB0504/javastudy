package OOPExercise;

class Exercise6_17 {
    public static int[] shuffle(int[] arr) {
        // 매개변수로 어떤 값이 넘어올지 모르기 때문에
        // 유효성 검사가 반드시 필요하다.
        if (arr == null || arr.length == 0)
            return arr;

        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);

            // arr[i] arr[j] . 와 의 값을 서로 바꾼다
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
