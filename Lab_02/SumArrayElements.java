// Write a program to find the sum of all elements of the array.

import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n;
        while (true) {
            System.out.print("Enter the number of elements in the array: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break; 
                System.out.print("Invalid input. Please enter a positive integer.");
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); 
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of all elements is: " + sum);

        sc.close();
    }
}
