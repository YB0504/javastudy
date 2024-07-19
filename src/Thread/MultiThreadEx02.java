package Thread;

class ATM implements Runnable {
    private long money = 10000;

    public long getMoney() {
        return money;
    }

    @Override
    public void run() { // Thread를 실행하기 위해 오버라이딩하여 구현
        // 한번에 하나의 Thread 만 실행 되도록 동기화
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                // 대기 중인 스레드 Runnable(준비 상태)로 전환
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
