import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner ts = new Scanner(System.in);
        System.out.println("Enter the size of  array:");
        int n= ts.nextInt();
        int num[]=new int[n];
        System.out.println("Insert your array:");
        for(int i=0;i<num.length;i++){
            num[i]=ts.nextInt();
        }
        System.out.println("Reversed array :");
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
    }
}
