// WAP to take 10 number input and print in revese order.

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];

        // Taking input of numbers
        for(int i=0;i<10;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
        for(int i=10-1;i>=0;i--){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
