// Module 14. Exercise 14.1.0. Bank + Clients.

public class Bank {

    private int money = 10000;

    int getMoney() {
        return money;
    }

    void take(int money) {
        this.money -= money;
    }

    void repay(int money) {
        this.money += money;
    }

    class Client extends Thread{
        @Override
        public void run() {
            while(true) {
                take(1000);
                repay(1000);
            }
        }
    }

    public Bank() {
        new Client().start();
        new Client().start();
        new Client().start();
    }
}
