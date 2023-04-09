// Module 14. Exercise 14.5.2. DeadLock.

public class Bank1452 {

    private int money = 10000;
    private volatile Object lock = new Object();
    private volatile Object lock2 = money;

    int getMoney() {
        return money;
    }

    void take(int money) {
        synchronized (lock) {
//            synchronized (lock2)
            {
                if (getMoney() >= 1000)
                    this.money -= money;
            }
        }
    }

    void repay(int money) {
        synchronized (lock) {
//            synchronized (lock2)
            {

                this.money += money;
            }
        }
    }

    class Client extends Thread{
        @Override
        public void run() {
            while(true)
//            if (money >= 1000 )
            {
                take(1000);
                repay(1000);
            }
        }
    }


    public Bank1452() {
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
        new Client().start();
    }

    public static void main(String[] args) throws InterruptedException {
        Bank1452 bank = new Bank1452();
        while(true) {
            if (bank.money <=0 || bank.money >= 10000) System.out.println(bank.money);
            Thread.sleep(100);
        }
    }

}