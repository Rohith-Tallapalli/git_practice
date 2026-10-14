import java.util.*;

public class eo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i : num) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("The Count of even is: " + even);
        System.out.println("The Count of odd is: " + odd);
    }
}