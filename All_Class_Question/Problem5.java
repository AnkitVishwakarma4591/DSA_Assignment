// WAP to perform addition of two matrix by using 2D array.

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Asking user to enter row and column
        System.out.print("Enter no. of row : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of col : ");
        int col = sc.nextInt();

        // Enter the elements of matrix1.
        int matrix1[][] = new int[row][col];
        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < col; j++) { // column
                System.out.print("Enter (" + (i + 1) + "," + (j + 1) + ") Element : ");
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // Enter the elements of matrix2.
        int matrix2[][] = new int[row][col];
        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < col; j++) { // column
                System.out.print("Enter (" + (i + 1) + "," + (j + 1) + ") Element : ");
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        

        // Adding two matrix
        int sum_matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < col; j++) { // column
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println();
        }

        // printing Sum of matrices
        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < col; j++) { // column
                System.out.print(sum_matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
