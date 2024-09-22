// Java program to demonstrate the removal of the elements from the
// stack
import java.util.*;
public class Pop_Operation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<String> stack2 = new Stack<String>();

        // Adding element in Stack
        System.out.println("Enter elements in Stack1:");
        for(int i=1;i<=5;i++){
            System.out.println("Enter "+i+" Integer element in stack : ");
            int element = sc.nextInt();
            stack1.push(element);
        }
        System.out.println(stack1);

        System.out.println("Enter elements in Stack2:");
        for(int i=1;i<=5;i++){
            System.out.println("Enter "+i+" String element in stack : ");
            String element = sc.next();
            stack2.push(element);
        }
        System.out.println(stack2);

        // performing pop operation on stack
        System.out.println("Popped element : "+stack1.pop());
        System.out.println("Popped element : "+stack1.pop());
        System.out.println("Popped element : "+stack2.pop());
        System.out.println("Popped element : "+stack2.pop());



        sc.close();
    }
}
