//Example for lambda expression.
//By default interface is abstract and all the methods in interface are abstract methods.

interface a{
    int add(int a,int b);
}
class j implements a{
    public int add(int a,int b){
        return a+b;
    }
}

public class example{
    public static void main(String[] args) {
        a obj = (int a,int b)->a+b;
        System.out.println(obj.add(10,20));
    }
}