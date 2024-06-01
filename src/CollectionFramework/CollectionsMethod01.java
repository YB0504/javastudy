package CollectionFramework;

import java.util.*;

// Collections의 동기화 메소드
public class CollectionsMethod01 {
    public static void main(String[] args) {
        List syncList = Collections.synchronizedList(new ArrayList<>());
    }
//    static Collection synchronizedCollection(Collection c);
//    static List synchronizedList(List list);
//    static Set synchronizedSet(Set s);
//    static Map synchronizedMap(Map m);
//    static SortedSet synchronizedSortedSet(SortedSet sortedSet);
//    static SortedMap synchronizedSortedMap(SortedMap sortedMap);
}
