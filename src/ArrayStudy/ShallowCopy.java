package ArrayStudy;

public class ShallowCopy {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = {1, 2, 3, 4};
        int[] b = a;

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
