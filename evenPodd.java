import java.util.Scanner;
//Rohith T
public class evenPodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num > 0 ){
            if(num%2==0){
                System.out.println("Positive Even");
            }
        }
        if(num < 0 ){
            if(num%2==0){
                System.out.println("Negitive Even");
            }
        }
        else{
            System.out.println("its a negetive num");
        }


}
}