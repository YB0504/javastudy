package Thread;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableEx {
    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            String result = "Called at " + LocalTime.now();
            return result;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("result : " + futureTask.get());
    }
}
