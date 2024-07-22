package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx02 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(addRunnable(1, 2));
        executor.submit(addRunnable(1, 3));
        executor.submit(addRunnable(1, 4));
        executor.submit(addRunnable(1, 5));

        executor.shutdown();

    }

    private static Runnable addRunnable(int num1, int num2) {
        return () -> System.out.println("result : " + (num1 + num2) + "(" + Thread.currentThread().getName() + ")");
    }
}
