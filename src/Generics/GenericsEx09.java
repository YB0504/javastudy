package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx09 {

    // 상위 타입 제한
    List<? extends Object> list = new ArrayList<String>();

    // 하위 타입 제한
    List<? super String> list2 = new ArrayList<Object>();

    // Number와 그 하위 타입만 받는다.
    public static void print(List<? extends Number> list) {
        for (Object e : list) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
        print(lists);
    }
}
