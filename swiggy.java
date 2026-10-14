class customer extends Thread {
    String cust_name;
    String cust_address;

    customer(String cust_name, String cust_address) {
        this.cust_name = cust_name;
        this.cust_address = cust_address;
    }

    public void run() {
        System.out.println("Mr/Ms " + cust_name + ", your order is confirmed");
        System.out.println("Your order will be delivered to: " + cust_address);
    }
}

class order extends Thread {
    String oid;

    order(String oid) {
        this.oid = oid;
    }

    public void run() {
        System.out.println("Your order ID is: " + oid + " Order will prepare soon");
    }
}

public class swiggy {
    public static void main(String[] args) {
        customer obj = new customer("Rohith", "Bangalore");
        order objj = new order("397y2387rho243r874");

        obj.start();
        objj.start();
    }
}