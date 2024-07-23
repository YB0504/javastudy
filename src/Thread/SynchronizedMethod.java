package Thread;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class SynchronizedMethod {
    public static void main(String[] args) {
        // 하나의 인스턴스에 각기 다른 스레드의 접근
        SynchronizedMethod method = new SynchronizedMethod();

        Thread thread1 = new Thread(() -> {
            System.out.println("스레드1 Lock " + LocalTime.now());
            method.syncMethod1("스레드1");
            System.out.println("스레드1 UnLock " + LocalTime.now());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("스레드2 Lock " + LocalTime.now());
            method.syncMethod2("스레드2");
            System.out.println("스레드2 UnLock " + LocalTime.now());
        });

        thread1.start();
        thread2.start();
    }

    private synchronized void syncMethod1(String msg) {
        System.out.println(msg + "의 syncMethod1 실행 중" + LocalTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void syncMethod2(String msg) {
        System.out.println(msg + "의 syncMethod2 실행 중" + LocalTime.now());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
