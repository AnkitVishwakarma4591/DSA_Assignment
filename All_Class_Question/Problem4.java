// WAP to print matrix of 3x3 order.

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        // Asking user to enter row and column
        System.out.print("Enter no. of row : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of col : ");
        int col = sc.nextInt();

        // Taking input of all element in matrix
        int matrix[][] = new int[row][col];
        for(int i=0;i<row;i++){ //row
            for(int j=0;j<col;j++){ //column
                System.out.print("Enter ("+(i+1)+","+(j+1)+") Element : ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // Printing element of matrix
        for(int i=0;i<row;i++){ //row
            for(int j=0;j<col;j++){ //column
                System.out.print(matrix[i][j]+" ");              
            }
            System.out.println();
        }
        sc.close();
    }
}
