package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMiddleOperation {
    public static void main(String[] args) {
        // Filter
        // ��Ʈ�� �� ��Ҹ� �ϳ��� ���Ͽ� �ɷ����� if�� ���� �۾�
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream()
                .filter(listItem -> listItem.contains("a"));
        System.out.print("Filter Stream : ");
        listStream.forEach(System.out::print);

        // Mapping
        // ��Ʈ�� �� ��ҵ��� �ϳ��� Ư�� ������ ��ȯ�ϴ� �۾�
        // ���� ��ȯ�ϱ� ���� ���ٸ� ���ڷ� �޴´�.
        Stream<String> mappingStream = list.stream()
                .map(String::toUpperCase);
//                .map(Integer::parseInt);    // ���ڿ� ���� ��ȯ
        System.out.print("\nMapping Stream : ");
        mappingStream.forEach(System.out::print);

        // Sorting
        // ��Ʈ�� �� ��ҵ��� �����ϴ� �۾�
        // Comparator ���
        Stream<String> sortStream1 = list.stream()
//                .sorted()   // ��������
                .sorted(Comparator.reverseOrder()); // ��������
        System.out.print("\nSorting Stream Reverse : ");
        sortStream1.forEach(System.out::print);

        List<String> sortList = Arrays.asList("a", "bb", "ccc");
        Stream<String> sortStream2 = sortList.stream()
                .sorted(Comparator.comparingInt(String::length));   // ���ڿ� ���� ���� ����
        System.out.print("\nSorting Stream Length : ");
        sortStream2.forEach(System.out::print);

        // Other
        Stream<String> otherStream = list.stream()
                .distinct()
                .limit(4)
                .skip(2)
                .peek(System.out::print);
        System.out.print("\nOther Stream : ");
        otherStream.forEach(e -> {});   // peek�� ����ϱ� ���� ������������ ��Ҹ� �Һ�
    }
}
