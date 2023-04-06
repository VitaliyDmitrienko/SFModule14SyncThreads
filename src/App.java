// Module 14. Exercise 14.3.3. volatile. Main 14.3.3.3+

public class App {

    public static void main(String[] args) throws InterruptedException {
        Processor processor1 = new Processor();
        processor1.start();

        Thread.sleep(1000);

        processor1.shutDown();
    }

}
