import java.util.Scanner;

class operations {
    Scanner sc = new Scanner(System.in);
    double deposit;
    double balance;

    void deposit() {
        System.out.println("Enter the amount to deposit: ");
        deposit = sc.nextDouble();
        balance += deposit;
        System.out.println("Deposited: " + deposit);
        System.out.println("Balance: " + balance);
    }

    void withdraw(){
        System.out.println("Enter the amount you want to withdraw:");
        double amount =sc.nextDouble();
        if(amount> balance){
            System.out.println("MOham chusko gadidhe");
        }
        else{
            System.out.println("Patu teesko pandaga chesko: "+ amount);
            balance -=amount;
            System.out.println("Remaining balance: "+balance);
        }
    }
}

public class atm {
    public static void main(String[] args) {
        operations obj = new operations();
        obj.deposit();
        obj.withdraw();
    }
}
