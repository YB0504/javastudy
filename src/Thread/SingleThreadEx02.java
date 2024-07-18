package Thread;

public class SingleThreadEx02 implements Runnable {
    private int[] temp;

    public SingleThreadEx02() {
        temp = new int[10];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
    }

    @Override
    public void run() {
        for (int i : temp) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Name : " + Thread.currentThread().getName());
            System.out.println("temp Value : " + i);
        }
    }

    public static void main(String[] args) {
        SingleThreadEx02 singleThreadEx02 = new SingleThreadEx02();
        Thread thread = new Thread(singleThreadEx02, "첫번째");
        thread.start();
    }
}
