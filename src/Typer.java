// Module 14. Exercise 14.3.0. Typer 15sec.

class Typer extends Thread{
    /* put your code here */

        static Object lock = new Object();
        String message;
        Typer(String message){
            this.message = message;
        }
        public void run(){
            synchronized(lock){
                for(int i = 0; i < message.length(); i++){
                    System.out.print(message.charAt(i));
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e){
                        break;
                    }
                }
            }
        }
    }