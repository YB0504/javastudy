package Thread;

class Money {
    private int myMoney = 10000;

    public int getMyMoney() {
        return myMoney;
    }

    // 메소드 전체에 synchronized 설정
    public synchronized boolean withdraw(int money) {
        if (myMoney >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myMoney -= money;
            return true;
        }
        return false;
    }
//
//     특정 코드 블럭에 synchronized 설정
//    public boolean withdraw(int money) {
//        synchronized (this) {
//            if (myMoney >= money) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                myMoney -= money;
//                return true;
//            }
//            return false;
//        }
//    }
}

class CreateThread implements Runnable {
    Money myMoney = new Money();

    @Override
    public void run() {
        while (myMoney.getMyMoney() > 0) {
            int money = (int) (Math.random() * 5 + 1) * 1000;

            boolean denied = !myMoney.withdraw(money);

            if (denied) {
                System.out.println("출금 거부 : " + money+"원");
            } else {
                System.out.printf("Thread : %s 출금 : %d원  남은 금액 : %d원\n",
                        Thread.currentThread().getName(), money, myMoney.getMyMoney());
            }
        }
    }
}

public class SynchronizedThreadEx01 {
    public static void main(String[] args) {
        Runnable thread = new CreateThread();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);

        thread1.setName("Thread1");
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();
    }
}
// https://ittrue.tistory.com/173
