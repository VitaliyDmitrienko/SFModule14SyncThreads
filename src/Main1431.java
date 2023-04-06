// Module 14. Exercise 14.3.0. Typer 15sec.
public class Main1431 {


    public static void main(String[] args) {
/*
Make class Typer which will type its Message
symbol by symbol every 500ms
*/

/* This code has to print
Message first. Message second.
in 15 seconds
*/
        new Typer("Message first.").start();
        new Typer("Message second.").start();

    }

}

