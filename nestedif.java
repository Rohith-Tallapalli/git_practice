import java.util.Scanner;
//Rohith T
public class nestedif{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter your role");
        String role = sc.nextLine();
        System.out.println("User Name");
        String user = sc.nextLine();
        System.out.println("Enter your Password");
        String password = sc.nextLine();

        if(role.equals("admin")){
            if(user.equals("rohith")){
                if(password.equals("rohith")){
                    System.out.println("Access Granted");
            }

            }
        }
        else{
            System.out.println("Access Denied");
        }
}
}