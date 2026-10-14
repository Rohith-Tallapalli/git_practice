import java.util.Scanner;

public class revnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        int rev = 0;
        int org= num;
        while(num>0)
        {
            num = num%10;
            rev =rev*10+num;
            num = num/10;
            org=num;
        }
        if (org == rev) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}