// Module 14. Exercise 14.1.0. Bank + Clients.

public class Bank1411 {

    private static int money = 10000;

    static int getMoney() {
        return money;
    }

    static synchronized void take(int money) {
        Bank1411.money -= money;
    }

    static synchronized void repay(int money) {
        Bank1411.money += money;
    }

    static class Client extends Thread{
        @Override
        public void run() {
            while(true) {
                take(1000);
                repay(1000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Client().start();
        new Client().start();
        new Client().start();
        while(true) {
            System.out.println(Bank1411.money);
            Thread.sleep(1000);
        }
    }
}
