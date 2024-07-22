package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx02 {
    public static void main(String[] args) {
        // 2개의 고정된 스레드 풀 생성
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // addRunnable() 작업 실행
        executor.submit(addRunnable(1, 2));
        executor.submit(addRunnable(1, 3));
        executor.submit(addRunnable(1, 4));
        executor.submit(addRunnable(1, 5));

        // 작업이 모두 완료 되면 스레드 풀 종료
        executor.shutdown();
    }

    private static Runnable addRunnable(int num1, int num2) {
        return () -> System.out.println("result : " + (num1 + num2) + "(" + Thread.currentThread().getName() + ")");
    }
}
