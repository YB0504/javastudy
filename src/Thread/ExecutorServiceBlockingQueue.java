package Thread;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceBlockingQueue {
    public static void main(String[] args) {
        // BlockingQueue 는 작업을 끝날 때 BlockingQueue에
        // 결과를 추가하고 메인 스레드에서 Queue를 기다리면 된다.

        // 전체적으로 보면, 멀티 스레드에서 이 Queue에 add를 하는 구조이다.
        // BlockingQueue 객체는 동시성을 보장하도록 구현되어 있다.
        ParallelExecutorService service = new ParallelExecutorService();
        service.submit("job1");
        service.submit("job2");
        service.submit("job3");
        service.submit("job4");

        for (int i = 0; i < 4; i++) {
            String result = service.take();
            System.out.println(result);
        }

        System.out.println("end");
        service.close();
    }

    private static class ParallelExecutorService {
        private int maxCore = Runtime.getRuntime().availableProcessors();
        private ExecutorService executor = Executors.newFixedThreadPool(maxCore);
        // 작업 결과를 저장할 BlockingQueue를 생성
        private BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        public ParallelExecutorService() {
        }

        // 전달된 작업을 스레드 풀에 제출한다.
        // 각 작업은 스레드 풀 내에서 실행되며, 작업이 완료되면
        // 결과를 생성하여 queue에 넣는다.
        public void submit(String job) {
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("finished : " + job);
                String result = job + ", " + threadName;

                try {
                    // 작업 결과를 queue에 저장한다.
                    // 만약 가득찬다면 공간이 생길 때까지 대기한다.
                    queue.put(result);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // queue에 저장되어 있던 결과를 꺼내온다.
        // 비어있다면 결과가 추가 될때 까지 대기한다.
        public String take() {
            try {
                return queue.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }

        // ExecutorService 를 종료한다.
        // shutdownNow() 를 호출하여 실행 중인 모든 작업을 중단 시키고,
        // 완료되지 않은 작업 목록을 반환한다.
        public void close() {
            List<Runnable> unfinishedTasks = executor.shutdownNow();
            // 만약 종료되지 않은 작업이 있으면 해당 개수를 출력한다.
            if (!unfinishedTasks.isEmpty()) {
                System.out.println("Not all tasks finished before calling close : " + unfinishedTasks.size());
            }
        }
    }
}
