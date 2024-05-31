package CollectionFramework;

import java.util.TreeSet;

public class TreeSetEx03 {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();
        int[] score = {80, 95, 50, 30, 35, 45, 10, 100};

        for (int i = 0; i < score.length; i++) {
            treeSet.add(new Integer(score[i]));
        }

        System.out.println("50 > i : " + treeSet.headSet(new Integer(50))); // 기준 보다 작은 값
        System.out.println("50 < i : " + treeSet.tailSet(new Integer(50))); // 기준 보다 큰 값
    }
}
