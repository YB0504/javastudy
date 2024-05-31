package CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableInteger {
    public static void main(String[] args) {
        Integer[] integers = {30, 40, 50, 10, 20};

        // sort(Object[] objArr, Comparator c)
        Arrays.sort(integers);  // Integer는 기본 정렬 기준으로 compareTo()를 가지고 있다.
        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, new DescComp());
        System.out.println(Arrays.toString(integers));
    }
}

class DescComp implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer && o2 instanceof Integer)) {
            return -1;      // Integer가 아니라면 비교하지 않고 -1을 반환한다.
        }
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        return i1.compareTo(i2) * -1;
    }
}
