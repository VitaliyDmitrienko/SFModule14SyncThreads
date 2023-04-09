// Module 14. Exercise 14.6.5. Double Parallel Processor.

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Processor2 implements Runnable {

    private int elem;

    public Processor2(int elem) {
        this.elem = elem;
    }

    @Override
    public void run() {
        Main1465.set.put("Key" + elem, 12);
    }
}

class AnotherProcessor implements Runnable {

    private int elem;

    public AnotherProcessor(int elem) {
        this.elem = elem;
    }

    @Override
    public void run() {
        Main1465.set.remove("Key" + elem);
    }
}

public class Main1465 {

    static Map<String, Integer> set = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            new Thread(new Processor2(i)).start();
            new Thread(new AnotherProcessor(i)).start();
        }

        Thread.sleep(1000); // хватит для готового результата

        System.out.println(set);
    }

}
