import java.util.Scanner;

public class userinput{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Value of the a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Value of bitwise and is "+(a&b));
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b);
        System.out.println(~a);
    }
}