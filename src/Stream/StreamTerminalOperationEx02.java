package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Product {
    int amount;
    String name;

    public Product(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}

public class StreamTerminalOperationEx02 {
    public static void main(String[] args) {

        // .collect()
        Set<Integer> evenNumber = IntStream.range(1, 1000).boxed()
                .filter(n -> (n % 2 == 0))
                .collect(Collectors.toSet());
        System.out.println("Stream Collect : " + evenNumber);

        // .joining()
        List<String> collectList1 = Arrays.asList("Banana", "Apple", "Melon");
        String returnValue1 = collectList1.stream()
                .collect(Collectors.joining());
        System.out.println("Stream Joining : " + returnValue1);

        // .joining() 구분자
        List<String> collectList2 = Arrays.asList("Banana", "Apple", "Melon");
        String returnValue2 = collectList2.stream()
                .collect(Collectors.joining(",", "<", ">"));
        System.out.println("Stream Joining : " + returnValue2);

        // 예시 리스트
        List<Product> productList = Arrays.asList(
                new Product(23, "potatoes"),
                new Product(14, "orange"),
                new Product(13, "lemon"),
                new Product(23, "bread"),
                new Product(13, "sugar"));

        // .groupingBy()
        productList.stream()
                .collect(Collectors.groupingBy(Product::getAmount));
        System.out.println("Stream GroupingBy : " + productList);

        // Match
        List<String> nameList = Arrays.asList("Java", "Python", "C++", "JavaScript");

        boolean anyMatch = nameList.stream()
                .anyMatch(name -> name.contains("a"));
        System.out.println("Stream AnyMatch : " + anyMatch);

        boolean allMatch = nameList.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("Stream AllMatch : " + allMatch);

        boolean noneMatch = nameList.stream()
                .noneMatch(name -> name.endsWith("c"));
        System.out.println("Stream NoneMatch : " + noneMatch);
    }
}
