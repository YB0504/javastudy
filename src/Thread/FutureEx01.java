package Thread;

import java.time.LocalTime;
import java.util.concurrent.*;

public class FutureEx01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ExecutorService 초기화
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Callable Task 생성
        Callable<String> callableTask = () -> {
            System.out.println(LocalTime.now() + " Task Start");
            Thread.sleep(1000L);
            return "Task Result";
        };

        // ExecutorService의 submit() 로 Task 실행
        Future<String> future = executorService.submit(callableTask);

        System.out.println(LocalTime.now() + "Waiting the task done");
        System.out.println("isDone 1 = " + future.isDone());
        String result = future.get();   // Task 결과 대기
        System.out.println("isDone 2 = " + future.isDone());
        System.out.println(LocalTime.now() + " future.get() = " + result);

    }
}
