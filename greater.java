import java.util.Scanner;

public class greater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num A:");
        int a =sc.nextInt();
        System.out.println("Enter num B:");
        int b =sc.nextInt();
        System.out.println("Enter num C:");
        int c =sc.nextInt();
        
        if( a>b && a>c){
            System.out.println("A is greater");
        }
        else if(b>c){
            System.out.println("B is greater");
        }
        else{
            System.out.println("C is greater");
        }
    }
}