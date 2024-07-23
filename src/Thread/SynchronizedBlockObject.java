package Thread;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class SynchronizedBlockObject {

    private final Object o1 = new Object();
    private final Object o2 = new Object();

    public static void main(String[] args) {
        SynchronizedBlockObject block = new SynchronizedBlockObject();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 Start " + LocalTime.now());
            block.syncBlockMethod1("Thread1");
            System.out.println("Thread1 End " + LocalTime.now());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 Start " + LocalTime.now());
            block.syncBlockMethod2("Thread2");
            System.out.println("Thread2 End " + LocalTime.now());
        });

        thread1.start();
        thread2.start();
    }

    private void syncBlockMethod1(String msg) {
        synchronized (o1) {
            System.out.println(msg + "의 syncBlockMethod1 실행 중" + LocalTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void syncBlockMethod2(String msg) {
        synchronized (o2) {
            System.out.println(msg + "의 syncBlockMethod2 실행 중" + LocalTime.now());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
