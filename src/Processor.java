// Module 14. Exercise 14.3.3. volatile.

class Processor extends Thread {

    private boolean running = true;
//    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Processing...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

    public void shutDown() {
        running = false;
    }
}

