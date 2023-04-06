// Module 14. Exercise 14.1.0. Bank + Clients.
public class Main1411 {

//    public static void main(String[] args) throws InterruptedException {
//        Bank1411 bank = new Bank1411();
//        while(true) {
//            System.out.println(bank.getMoney());
//            Thread.sleep(1000);
//        }
//    }
    public static void main(String[] args) throws InterruptedException {
        Bank1430 bank = new Bank1430();
        while(true) {
            System.out.println(bank.getMoney());
            Thread.sleep(1000);
        }
    }
}
