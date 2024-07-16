package Stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamTerminalOperationEx01 {
    public static void main(String[] args) {

        // ���
        int sum = IntStream.range(1, 10).sum();
        System.out.println("Stream Sum : " + sum);

        // .count()�� ��ȯ Ÿ���� Long
        int count = (int) IntStream.range(1, 10).count();
        System.out.println("Stream Count : " + count);

        // �ִ�, �ּ� ���� ��� Optional �� �̿� ��ȯ
        // Optional �� �״�� ����ϸ� OptionalInt[1] �� ���� ���·� ��µȴ�.
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
