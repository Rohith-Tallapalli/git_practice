import java.util.Scanner;

public class sumdigit{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter num:");
        int num =sc.nextInt();
        int sum = 0;
        while(num>0){
            int digit =num%10;
            sum=sum+digit;
            num=num/10;
        }

        System.out.println(sum);

    }
}