// WAP to find largest and Smallest value in any array by using 1D.

import java.util.Scanner;

public class Largest_Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" number :");
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for(int i=0;i<size;i++){
            if(array[i] > max){
                max = array[i];
            }else if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Largest number in array is  :"+ max);
        System.out.println("Smallest number in array is  :"+ min);
        sc.close();
    }
}
