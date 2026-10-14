class employee{
    String name;
    int salary;

    void display(String name, int salary){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
`

}
class developer extends employee{
    String developer;
    void display_dev(String developer){
        System.out.println("Developer: "+developer);
    }
}
public class inheritance {
    public static void main(String[] args){
        developer d= new developer();
        d.name = "John";
        d.salary = 50000;
        d.display(d.name, d.salary);
        d.developer = "Java Developer";
        d.display_dev(d.developer);
    }

}
