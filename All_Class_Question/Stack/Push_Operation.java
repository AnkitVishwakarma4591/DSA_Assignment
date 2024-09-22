// Java program to add the elements in the stack

import java.util.*;
public class Push_Operation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // initialization of Stack
        Stack<Integer> stack1 = new Stack<Integer>() ;
        Stack <String> stack2 = new Stack<String>();

        // Pushing element in stack
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack2.push("Ankit");
        stack2.push("Anurag");
        stack2.push("Mandeep");
        stack2.push("Jayesh");
        stack2.push("Nishant");

        System.out.println(stack1);
        System.out.println(stack2);

        sc.close();
    }
}