package CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            // -1을 곱해서 기본 정렬방식의 역으로 변경
            // 아니면 c1과 c2의 위치를 바꿔줘도 된다.
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}

public class ComparatorString {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);    // String의 Comparable 구현에 의한 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);     // 대소문자 구분없이 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());  // 역순 정렬
        System.out.println("strArr = " + Arrays.toString(strArr));
    }
}
