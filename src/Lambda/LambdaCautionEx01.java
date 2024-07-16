package Lambda;

import java.util.stream.IntStream;

public class LambdaCautionEx01 {
    public static void main(String[] args) {

        // ���ٽ� stream ��ȸ------------------------------------
        long startTime = System.nanoTime(); // �ڵ� ���� �ð�

        IntStream.range(0, 10000).forEach((value) -> {});

        long endTime = System.nanoTime(); // �ڵ� ���� �ð�
        long durationTimeSec = endTime - startTime;
        System.out.println("���ٽ� stream ��ȸ : " + durationTimeSec + "n/s");
        
        // �Ϲ� for�� ��ȸ----------------------------------------
        startTime = System.nanoTime(); // �ڵ� ���� �ð�
        for (int i = 0; i < 10000; i++) {}

        endTime = System.nanoTime(); // �ڵ� ���� �ð�
        durationTimeSec = endTime - startTime;
        System.out.println("�Ϲ� for�� ��ȸ : " + durationTimeSec + "n/s");
    }
}
