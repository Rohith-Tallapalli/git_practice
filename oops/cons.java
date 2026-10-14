
class car{
    String name;
    String model;
    String color;

    car(String name,String model,String color){
        this.name=name;
        this.model=model;
        this.color=color;
    }

    void details(){
        System.out.println(name +" "+model+" "+color);
    }
}

public class cons {
    public static void main(String[] args) {
        car obj1 = new car("Toyato","Land Cruiser","Black");
        obj1.details();
    }

}
