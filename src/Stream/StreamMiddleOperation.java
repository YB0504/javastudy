package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMiddleOperation {
    public static void main(String[] args) {
        // Filter
        // 스트림 내 요소를 하나씩 평가하여 걸러내는 if문 역할 작업
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream()
                .filter(listItem -> listItem.contains("a"));
        System.out.print("Filter Stream : ");
        listStream.forEach(System.out::print);

        // Mapping
        // 스트림 내 요소들을 하나씩 특정 값으로 변환하는 작업
        // 값을 변환하기 위한 람다를 인자로 받는다.
        Stream<String> mappingStream = list.stream()
                .map(String::toUpperCase);
//                .map(Integer::parseInt);    // 문자열 정수 변환
        System.out.print("\nMapping Stream : ");
        mappingStream.forEach(System.out::print);

        // Sorting
        // 스트림 내 요소들을 정렬하는 작업
        // Comparator 사용
        Stream<String> sortStream1 = list.stream()
//                .sorted()   // 오름차순
                .sorted(Comparator.reverseOrder()); // 내림차순
        System.out.print("\nSorting Stream Reverse : ");
        sortStream1.forEach(System.out::print);

        List<String> sortList = Arrays.asList("a", "bb", "ccc");
        Stream<String> sortStream2 = sortList.stream()
                .sorted(Comparator.comparingInt(String::length));   // 문자열 길이 기준 정렬
        System.out.print("\nSorting Stream Length : ");
        sortStream2.forEach(System.out::print);

        // Other
        Stream<String> otherStream = list.stream()
                .distinct()
                .limit(4)
                .skip(2)
                .peek(System.out::print);
        System.out.print("\nOther Stream : ");
        otherStream.forEach(e -> {});   // peek를 출력하기 위해 최종연산으로 요소를 소비
    }
}
