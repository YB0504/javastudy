package CollectionFramework;

import java.util.*;

public class HashMapEx02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("김자바", 90);
        hashMap.put("김자바", 100);
        hashMap.put("이자바", 100);
        hashMap.put("강자바", 80);
        hashMap.put("안자바", 90);

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("이름 : " + entry.getKey() + ", 점수 : " + entry.getValue());
        }

        set = hashMap.keySet();
        System.out.println("명단 : " + set);

        Collection values = hashMap.values();
        iterator = values.iterator();

        int total = 0;

        while (iterator.hasNext()) {
            int i = (int) iterator.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고 : " + Collections.max(values));
        System.out.println("최저 : " + Collections.min(values));
    }
}
