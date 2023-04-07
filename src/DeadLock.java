// Module 14. Exercise 14.5.1. DeadLock.
public class DeadLock implements Runnable {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        new Thread(deadLock).start();
        new Thread(deadLock).start();
    }

    @Override
    public void run() {
        doTask1();
        doTask2();
    }

//    private void doTask1() {
//        synchronized (lock1) {
//            synchronized (lock2) {
//                System.out.println("Doing task 1");
//            }
//        }
//    }
   private void doTask1() {
        synchronized (lock1)
             {
                System.out.println("Doing task 1");
            }

    }

//    private void doTask2() {
//        synchronized (lock2) {
//            synchronized (lock1) {
//                System.out.println("Doing task 2");
//            }
//        }
//    }
    private void doTask2() {
        synchronized (lock2) {
                System.out.println("Doing task 2");
            }

    }

}
