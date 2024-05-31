package CollectionFramework;

import java.util.*;

public class HashSetEx02 {
    public static void main(String[] args) {
        Set set = new HashSet();
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        // Collections 클래스의 sort를 사용하여 정렬
        // 메소드의 인자로 List 타입이 필요하기 때문에
        // LinkedList클래스의 생성자를 이용하여 HashSet에 저장된 객체들을
        // 담아서 처리
        List list = new LinkedList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
