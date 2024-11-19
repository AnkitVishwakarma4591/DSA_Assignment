// Write a program to merge two arrays of the same size sorted in descending order.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        while(true){
            System.out.print("Enter the size of the arrays: ");
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n>0) break;
                System.out.println("Invalid input. Please enter an integer. ");
            }else{
                System.out.println("Invalid input. Please enter an integer. ");
                sc.next();
            }
        }
        
        int arr1[] = new int[n];
        System.out.println("Enter the elements of the first array: ");

        for (int i = 0; i < n; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    arr1[i] = sc.nextInt();
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter an integer. ");
                    sc.next(); 
                }
            }
        }
        int arr2[] = new int[n];
        System.out.println("Enter the elements of the second array: ");

        for (int i = 0; i < n; i++) {
            while (true) {
                if (sc.hasNextInt()) {
                    arr2[i] = sc.nextInt();
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter an integer. ");
                    sc.next(); 
                }
            }
        }
        
        
        Integer mergedArray[] = new Integer[n + n];
        
        for(int i=0;i<n;i++){
            mergedArray[i] = arr1[i];
        }
        for(int i=0;i<n;i++){
            mergedArray[n+i] = arr2[i];
        }
        
        Arrays.sort(mergedArray, Collections.reverseOrder());
        
        System.out.println("The merged array sorted in descending order is: ");
        for (int num : mergedArray) {
            System.out.print(num+" ");
        }
        

        
        sc.close();
    }
}
