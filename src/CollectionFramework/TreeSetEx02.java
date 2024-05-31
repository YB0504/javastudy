package CollectionFramework;

import java.util.TreeSet;

public class TreeSetEx02 {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("Car");
        set.add("car");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("element");
        set.add("Bat");

        // 대소문가 소문자보다 우선시 되기 때문에 의도와는 다른 결과가 나올 수 있다.
        // 가능하면 대문자나 소문자 둘중 하나로 통일하는 것이 좋다.
        System.out.println(set);
        System.out.println("범위 탐색 : from " + from + " to " + to);

        // 범위 검색을 할 때 시작범위는 포함되지만 끝범위는 포함 되지않는다.
        System.out.println("result1 : " + set.subSet(from, to));
        // 끝범위를 포함 시키기위해서는 끝범위에 다른 문자열을 포함시키면 된다.
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));

    }
}
