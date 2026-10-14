import java.util.Scanner;

public class rohith{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        if(age>18){
            System.out.println("Elegible for vote");
        }
        else{
             System.out.println("Not elegible for vote");
        }

    }

} 