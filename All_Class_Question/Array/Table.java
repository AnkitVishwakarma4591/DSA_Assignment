// WAP to print table of 5 using array
import java.util.*;
public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table of five :");
        int table[] = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("5 * "+(i+1)+" = ");
            table[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println(table[i]);
        }
        sc.close();
    }
}
