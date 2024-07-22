package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx01 {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // scheduleAtFixedRate()
        // 이전 작업이 완료 되는 데 걸린 시간에 관계 없이 고정된 속도로 작업이 실행 되도록 예약
        // Runnable, initialDelay(첫 실행 전 초기 지연 시간), period(각 후속 작업 실행 사이 시간), TimeUnit(초기 지연 및 기간 매개 변수의 시간 단위)
        // 와 같은 4개의 인자를 받는다.
        executor.scheduleAtFixedRate(() -> System.out.println("hi " + Thread.currentThread().getName()),
                1, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted while sleeping" + e);
        }
        executor.shutdown();
    }
}
