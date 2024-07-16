package Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("aaa", "bbb", "ccc", "ddd");

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // �ڵ带 ������ �� ���ٽ��� Ÿ���� �����ϱ⿡ �ð��� �ɸ��� ������
        // ��Ȳ�� ���󼭴� ���ٽ� �Ķ���Ϳ� Ÿ���� ����ϱ⵵ �Ѵ�.
        Collections.sort(words, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
