package Thread;

public class MultiThreadEx01 implements Runnable {
    int testNum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("A")) {
                System.out.println("============================");
                testNum++;
            }
            System.out.println("Thread Name = " + Thread.currentThread().getName() + "TestNum = " + testNum);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        MultiThreadEx01 multiThreadEx01 = new MultiThreadEx01();
        MultiThreadEx01 multiThreadEx02 = new MultiThreadEx01();
        Thread thread1 = new Thread(multiThreadEx01, "A");
        Thread thread2 = new Thread(multiThreadEx02, "B");

        thread1.start();
        thread2.start();

        Thread.currentThread().getName();
    }
}
