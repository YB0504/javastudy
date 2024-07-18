package Thread;

public class SingleThreadEx01 extends Thread {
    private int[] temp;

    public SingleThreadEx01(String threadName) {
        super(threadName);
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
            System.out.println("Thread Name : " + currentThread().getName());
            System.out.println("temp Value : " + i);
        }
    }

    public static void main(String[] args) {
        SingleThreadEx01 singleThreadEx01 = new SingleThreadEx01("첫번째");
        singleThreadEx01.start();
    }
}
