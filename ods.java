import java.lang.Runnable;

class orders implements Runnable {
    String order_id;
    String dish;

    orders(String order_id, String dish) {
        this.order_id = order_id;
        this.dish = dish;
    }

    @Override
    public void run() {
        try {
            // Accepting the order
            System.out.println("Order ID: " + order_id+ "\nDish: " + dish+ "\nOrder accepted");
            System.out.println("----------------------------------------");
            Thread.sleep(1000);

            // Preparing
            System.out.println("Order ID: " + order_id+ "\nDish: " + dish+ "\nPreparing food...");
            System.out.println("----------------------------------------");
            Thread.sleep(2000);

            // Packing
            System.out.println("Order ID: " + order_id+ "\nDish: " + dish+ "\nPacking food...");
            System.out.println("----------------------------------------");
            Thread.sleep(1000);

            // Marking 
            System.out.println("Order ID: " + order_id
                    + "\nDish: " + dish
                    + "\nReady for delivery!");
            System.out.println("----------------------------------------");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Order interrupted: " + order_id);
        }
    }
}

public class ods {
    public static void main(String[] args) {
        orders order1 = new orders("A001", "Pizza");
        orders order2 = new orders("A002", "Burger");
        orders order3 = new orders("A003", "Biryani");

        Thread t1 = new Thread(order1);
        Thread t2 = new Thread(order2);
        Thread t3 = new Thread(order3);

        t1.start();
        t2.start();
        t3.start();
    }
}
