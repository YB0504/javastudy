package java_level_test_week5;

import java.util.*;

public class ListConvertSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(1);

        Set tset = new TreeSet(list);       // 값이 정렬되어 저장 1,3,4,6,7
        Set hset = new LinkedHashSet(list); // 순서 유지 중복 불가 3,6,1,7,4
        Stack stack = new Stack();
        stack.addAll(hset); // LIFO(후입선출)
        // 3            4
        // 6            7
        // 1     ->     1
        // 7            6
        // 4            3

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            // 4,7,1,6,3
        }

    }
}
