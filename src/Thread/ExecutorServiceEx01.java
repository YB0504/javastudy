package Thread;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceEx01 {
    public static void main(String[] args) throws InterruptedException {
        // 4개의 스레드를 생성
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // submit(() -> {}) : 멀티 스레드로 처리할 작업을 예약 한다.
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Job1 : " + threadName);
        });

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Job2 : " + threadName);
        });

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Job3 : " + threadName);
        });

        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Job4 : " + threadName);
        });

        // 더 이상 ExecutorService 에 Task 를 추가할 수 없음
        // 작업이 모두 완료 되면 스레드 풀을 shutdown 시킨다.
        executor.shutdown();

        // shutdown() 호출 전에 등록된 Task 중 아직 완료되지 않은 Task 가 있을 수 있다.
        // Timeout을 설정 하고 완료 되기를 대기
        // 설정한 시간 전에 완료 되면 true, 시간이 지나도 완료 되지 않으면 false 를 리턴
        if (executor.awaitTermination(20, TimeUnit.SECONDS)) {
            System.out.println(LocalTime.now() + " All jobs ar terminated");
        } else {
            System.out.println(LocalTime.now() + " some jobs are not terminated");

            // 모드 Task 를 강제 종료
            executor.shutdownNow();
        }

        System.out.println("end");
    }
}
