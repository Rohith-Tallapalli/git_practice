import java.util.Scanner;
public class arrayss {

    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4, 5};
        // int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] numbers = new int[size];
            System.out.println("Enter " + size + " elements:");

            for(int i=0;i<size;i++){
                numbers[i] = sc.nextInt();
                System.out.println("The elements in the array are:");
                System.out.print(numbers[i] + " ");
            }

            // for(int i=0;i<numbers.length;i++){
            //     sum= sum+numbers[i];
            // }
            // int avg = sum / numbers.length;
        }
    }
}
