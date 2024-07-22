package Thread;

import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class FutureEx02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Future 인터페이스를 상속받은 CompletableFuture 클래스를 이용
        // Future 객체 생성
        CompletableFuture<Integer> future = new CompletableFuture<>();

        // Thread Pool 생성
        Executors.newCachedThreadPool().submit(() -> {
            System.out.println(LocalTime.now() + " Doing something");
            Integer sum = 1 + 1;
            Thread.sleep(3000);
            future.complete(sum);
            return null;
        });

        System.out.println(LocalTime.now() + " Waiting the task done");
        Integer result = future.get();
        System.out.println(LocalTime.now() + "Result : " + result);
    }
}
