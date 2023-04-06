// Module 14. Exercise 14.1.0. Bank + Clients.
public class Main1410 {

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
