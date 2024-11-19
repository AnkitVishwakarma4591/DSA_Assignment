// Write a program to store elements in an array and print them.

import java.util.Scanner;

public class StoreAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in the array are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
