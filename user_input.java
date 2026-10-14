import java.util.Scanner; //ROhith
public class user_input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student details:");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Roll Number:");
        String roll_number = sc.nextLine();
        System.out.println("Enter your branch:");
        String branch = sc.nextLine();
        System.out.println("Enter your Age:");
        
        
        System.out.println("Successfully Admitted.......!");

    }

}