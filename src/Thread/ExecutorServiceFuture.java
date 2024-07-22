package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceFuture {
    public static void main(String[] args) {
        // Runtime.getRuntime().availableProcessors();
        // 현재 PC의 사용가능한 Core 개수를 알 수 있기 때문에
        // 효율적으로 스레드를 생성할 수 있다.
        int maxCore = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(maxCore);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            int index = i;
            // submit() 은 Future 객체를 리턴한다.
            // 모든 작업을 예약할 때, Future 를 따로 저장해두면
            // 메인 스레드에서 스레드 풀에서 처리한 결과를 알 수 있다.
            futures.add(executor.submit(() -> {
                System.out.println("finished job : " + index);
                return "job" + index + " " + Thread.currentThread().getName();
            }));
        }

        // List 에 future 를 job1 ~ job4 까지의 작업을 순서대로 추가했기에
        // 아래의 for 문에서 1 ~ 4 작업을 순서대로 기다린다.
        // Future 에 대한 for 문이 끝나면 ExecutorService 가 필요 없어 지므로 바로 종료 한다.
        for (Future<String> future : futures) {
            String result = null;
            try {
                // 작업이 추가되고 처리에 대한 결과를
                // 작업이 종료될 때까지 기다린다.
                result = future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println(result);
        }

        executor.shutdownNow();
        System.out.println("end");
    }
}
