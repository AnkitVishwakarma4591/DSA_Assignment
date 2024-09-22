// Java program to demonstrate the accessing of the elements
// from the stack

import java.util.*;;
public class Peek_Operation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> stack1 = new Stack<String>();

        System.out.println(stack1.size());

        stack1.push("Engineers");
        stack1.push("Never");
        stack1.push("Give");
        stack1.push("Up");

        System.out.println(stack1);

        System.out.println("Elements that's on Top :"+stack1.peek());
        System.out.println(stack1.size());
        System.out.println(stack1.search("Never"));

        sc.close();
    }
}
