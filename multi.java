//multiplication of 2 matrices
import java.util.Scanner;

public class multi{
    public static void main(String[] args){
        Scanner ts= new Scanner(System.in);
        System.out.println("Enter the no. of rows & columns:");
        int row = ts.nextInt();
        int col = ts.nextInt();
        int [][] arr_1= new int[row][col];
        int [][] arr_2= new int[row][col];
        int [][] arr_3= new int[row][col];
        System.out.println("Enter first matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr_1[i][j]=ts.nextInt();
            }
        }
        System.out.println("Enter second matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr_2[i][j]=ts.nextInt();
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr_3[i][j]=0;
                for(int k=0;k<col;k++){
                    arr_3[i][j]+=arr_1[i][k]*arr_2[k][j];
                }
            }
        }
        System.out.println("Resultant matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr_3[i][j]+" ");
            }
            System.out.println();
        }

    }



}
