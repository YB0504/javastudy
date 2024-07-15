package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx09 {

    // ���� Ÿ�� ����
    List<? extends Object> list = new ArrayList<String>();

    // ���� Ÿ�� ����
    List<? super String> list2 = new ArrayList<Object>();

    // Number�� �� ���� Ÿ�Ը� �޴´�.
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
