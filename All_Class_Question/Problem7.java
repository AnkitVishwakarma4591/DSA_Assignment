// WAP to find any elements from the given array.

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Enter Array Size
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int number[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            number[i] = sc.nextInt();
        }

        // 
        System.out.print("Enter number that u want to find : ");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(number[i] == num){
                System.out.println("Found at index :"+i);
            }
            else{
                System.out.println("Not Found");
            }
        }


        sc.close();
    }
}
