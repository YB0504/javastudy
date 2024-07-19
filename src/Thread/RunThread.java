package Thread;

public class RunThread {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        System.out.println("Thread Name : " + Thread.currentThread().getName());

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> System.out.println("Thread Name : " + Thread.currentThread().getName()));
            // 싱글 스레드 방식으로 동작하기 때문에 Main Thread를 실행 시키고 종료하고를 반복한다.
            threads[i].run();
        }
    }
}
