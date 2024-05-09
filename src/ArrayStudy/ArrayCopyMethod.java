package ArrayStudy;

import java.util.Arrays;

import static java.lang.System.*;

public class ArrayCopyMethod {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        int[] b = Arrays.copyOf(a, a.length);
        int[] c = Arrays.copyOfRange(a, 2, 4);
        int[] d = new int[a.length];
        System.arraycopy(a, 0, d, 0, a.length);
    }
}
