package Stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamTerminalOperationEx01 {
    public static void main(String[] args) {

        // 통계
        int sum = IntStream.range(1, 10).sum();
        System.out.println("Stream Sum : " + sum);

        // .count()는 반환 타입이 Long
        int count = (int) IntStream.range(1, 10).count();
        System.out.println("Stream Count : " + count);

        // 최대, 최소 값의 경우 Optional 을 이용 반환
        // Optional 을 그대로 출력하면 OptionalInt[1] 와 같은 형태로 출력된다.
        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt min = IntStream.range(1, 10).min();
        System.out.println("Stream Max : " + max.getAsInt());
        System.out.println("Stream Min : " + min);

        OptionalDouble avg = IntStream.range(1, 10).average();
        System.out.println("Stream Average : " + avg);

        int evenSum = IntStream.range(1, 10)
                .filter(v -> ((v % 2) == 0))
                .sum();
        System.out.println("Even Sum : " + evenSum);

    }
}
