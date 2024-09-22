// WAP to perform addition of 6 number using array.

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int add[] = new int[6];

        // taking input from the user
        for(int i=0;i<6;i++){
            System.out.print("Enter number :");
            add[i] = sc.nextInt();
        }
        // adding all number
        int sum = 0;
        for(int i=0;i<6;i++){
            sum += add[i];
        }
        System.out.println("Sum of number : "+sum);
        sc.close();
    }
}
