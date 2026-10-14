class requires{
    String cust_name;
    String proof;
    int days;
    double price;

    requires(String cust_name, String proof,int days,double price){
        this.cust_name=cust_name;
        this.proof=proof;
        this.days=days;
        this.price=price;
    }

    void details(){
        System.out.println("Customer name is "+cust_name+"\n"+"Proof type is "+proof+"\n"+"How many days for rent:"+days+"\n"+"Price per day "+price+"\n"+"Total amount is "+ days*price);
    }


}




public class rent {
    public static void main(String[] args) {
        requires obj1 = new requires("Rohith","Aadhaar",7,250);
        obj1.details();
    }
}
