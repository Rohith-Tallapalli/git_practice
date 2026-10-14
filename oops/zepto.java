class product{

   
    String name ="Biriyani";
    double price = 150.0;
    int quantity = 5;
    int totalPrize;

    void display(){
        System.out.println("Product Details: "+name+"\nPrice: "+price+"\nQuantity: "+quantity);
    }

    int totalPrice(double price, int quantity){
        return (int)(price*quantity);
    }

    void offer(){
        if(totalPrice >=500){
            System.out.println("Your offer prize is"+ totalPrize - 100);
        }
        else if(totalPrize>250){
            System.out.println("You offer prize is" +totalPrize - 50);
    }
    }

}

public class zepto{
    public static void main(String[] args){
        product obj1 = new product();
        obj1.display();
        int total = obj1.totalPrice(obj1.price, obj1.quantity);
        System.out.println("Total Price: " + total);
        obj1.offer();
    }
}