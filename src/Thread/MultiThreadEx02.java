package Thread;

class ATM implements Runnable {
    private long money = 10000;

    public long getMoney() {
        return money;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                notify();
                try {
                    wait();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (getMoney() <= 0) {
                    break;
                }
                withDraw(1000);
            }
        }
    }

    public void withDraw(long howMuch) {
        if (getMoney() > 0) {
            money -= howMuch;
            System.out.print(Thread.currentThread().getName() + " : ");
            System.out.printf("잔액 : %,d 원 %n", getMoney());
        } else {
            System.out.print(Thread.currentThread().getName() + " : ");
            System.out.println("잔액 부족");
        }
    }
}

public class MultiThreadEx02 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Thread mother = new Thread(atm, "Mother");
        Thread son = new Thread(atm, "Son");

        mother.start();
        son.start();
    }
}
