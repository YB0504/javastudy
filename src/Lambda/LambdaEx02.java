package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("aaa", "bbb", "ccc", "ddd");

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // 코드를 복기할 때 람다식의 타입을 유추하기에 시간이 걸리기 때문에
        // 상황에 따라서는 람다식 파라미터에 타입을 명시하기도 한다.
        Collections.sort(words, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
