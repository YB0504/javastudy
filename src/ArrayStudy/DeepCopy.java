package ArrayStudy;

public class DeepCopy {
    public static void main(String[] args) {
        // 깊은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }
}
