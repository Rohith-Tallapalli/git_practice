class java{
    public void greet(){
        System.out.println("Chaviti nakodaka po ra bayatiki");
    }

    public void sum(int a, int b){
        System.out.println("Sum is: " + (a + b));
    }
}

public class object1{
    public static void main(String[] args){
        java obj1 = new java();
        obj1.greet();
        obj1.sum(10, 20);
    }
}