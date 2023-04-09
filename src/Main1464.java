// Module 14. Exercise 14.6.4. Pizzeria.
public class Main1464 {
    public static void main(String[] args) throws InterruptedException {

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.order("Margarita");
        Thread.sleep(100);
        pizzeria.order("Pepperoni");
        Thread.sleep(100);
        pizzeria.order("Sicilian");
        Thread.sleep(100);
        pizzeria.order("Greek");


        Pizzeria pizzeria2 = new Pizzeria();
        pizzeria2.order("Margarita");
        Thread.sleep(500);
        pizzeria2.order("Pepperoni");
        Thread.sleep(500);
        pizzeria2.order("Sicilian");
        Thread.sleep(500);
        pizzeria2.order("Greek");

    }
}
