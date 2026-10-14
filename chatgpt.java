
import java.util.Scanner;

public class chatgpt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = in.nextInt();

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.err.println("Not palindrome");
        }
    }
}



// for(int i=1;i<=n;i++){
//                 fact=fact*i;
//             }
//             System.out.println("Factorial of "+n+" is: "+fact);


//    int sum=0;
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//         System.out.println("Sum is: "+sum);




