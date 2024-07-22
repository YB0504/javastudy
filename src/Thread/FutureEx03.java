package Thread;

import java.time.LocalTime;
import java.util.concurrent.*;

public class FutureEx03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // submit()으로 제출한 작업을 Future 객체로 반환
        Future<Integer> future = executor.submit(() -> {
            System.out.println(LocalTime.now() + " Starting runnable");
            Integer sum = 1 + 1;
            Thread.sleep(4000);
            System.out.println(LocalTime.now() + " Exiting runnable");
            return sum;
        });

        System.out.println(LocalTime.now() + " Waiting the task done");
        Integer result = null;

        try {
            // Future.get() 에 Timeout 설정
            // 설정한 시간 동안 작업이 완료되기를 대기
            result = future.get(2000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            System.out.println(LocalTime.now() + " Time out");
            result = 0;
        }
        System.out.println(LocalTime.now() + " Result : " + result);
    }
}
