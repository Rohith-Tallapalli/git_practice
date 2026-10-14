import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        try (Scanner scc = new Scanner(System.in)) {
            int numm = scc.nextInt();
            int org = numm;
            int a = 0;

            while (numm > 0) {
                int digit = numm % 10;
                a += digit * digit * digit;
                numm /= 10;
            }

            if (org == a) {
                System.out.println("ArmStrong");
            } else {
                System.out.println("Not");
            }
        }
    }
}
