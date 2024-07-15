package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MakeStream {
    public static void main(String[] args) {
        // �迭 ��Ʈ��
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stringStream1 = Arrays.stream(arr);

        // �÷��� ��Ʈ��(List)
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stringStream2 = list.stream();

        // Stream.builder()
        Stream<String> builderStream = Stream.<String>builder()
                .add("a").add("b").add("c")
                .build();

        // �⺻ Ÿ�� ��Ʈ��
        IntStream intStream1 = IntStream.range(1, 5);
        IntStream intStream2 = IntStream.rangeClosed(1, 5);

        // ���� ��Ʈ��
        Stream<String> parallelStream = list.parallelStream();

        stringStream1.forEach(System.out::print);
        System.out.println();
        stringStream2.forEach(System.out::print);
        System.out.println();
        builderStream.forEach(System.out::print);
        System.out.println();
        intStream1.forEach(System.out::print);
        System.out.println();
        intStream2.forEach(System.out::print);
        System.out.println();
        parallelStream.forEach(System.out::print);
    }
}
