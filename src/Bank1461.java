// Module 14. Exercise 14.6.1. Sync Bank + Clients. AtomicInteger.

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank1461 {

    private AtomicInteger money = new AtomicInteger();

    int getMoney() {
        return money.get();
    }

    void take(int money) {
        // безопасно уменьшаем
        this.money.addAndGet(-money);
    }

    void repay(int money) {
        //безопасно увеличиваем
        this.money.addAndGet(money);
    }

    class Client extends Thread{
        @Override
        public void run() {
            while(true) {
                // выдаем кредит, только если
                // есть свободные средства
                if (getMoney() >= 1000) {
                    take(1000);
                    repay(1000);
                }
            }
        }
    }

    public Bank1461() {
        //устанавливаем начальное значение
        money.set(10000);
        for (int i = 0; i < 5; i++)
            new Client().start();

    }

    public static void main(String[] args) throws InterruptedException {
        Bank1461 bank = new Bank1461();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}