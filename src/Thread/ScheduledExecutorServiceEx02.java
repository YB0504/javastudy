package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx02 {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // 한 Task 실행이 끝날 때와 다음 실행이 시작될 때 사이에
        // 고정된 지연을 두고 작업을 실행 하도록 예약 합니다.
        // Runnable, initialDelay(첫 실행 전 초기 지연 시간),
        // delay(하나의 Task 실행이 완료 되고 다음 실행이 시작될 때 까지의 지연 시간), TimeUnit(초기 지연 및 기간 매개 변수의 시간 단위)
        // 와 같은 4개의 인자를 받는다.
        executor.scheduleWithFixedDelay(() -> System.out.println("hi " + Thread.currentThread().getName()),
                1, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted while sleeping" + e);
        }

        executor.shutdown();
    }
}
