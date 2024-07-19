package Thread;

public class StartThread {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        System.out.println("Thread Name : " + Thread.currentThread().getName());

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println("Thread Name : " + Thread.currentThread().getName()));
            // start() 가 호출될 때마다 새로운 스레드를 위한 호출 스택이 생성된다.
            threads[i].start();
        }
    }
}
