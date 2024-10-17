// Perform push & Pop operation using Stack in same program by using Menu-Driven Concept and Output 
// Format Should be Push Pop Display Exit in java

import java.util.*;
public class Menu_Driven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<Integer>();

        int choice;
        
        // Menu Driven

        do{
            System.out.println("\n Menu :");
            System.out.println("1. Push ");
            System.out.println("2. Pop ");
            System.out.println("3. Display ");
            System.out.println("4. Exit ");
            System.out.print("Enter you Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1 : System.out.print("Enter the element to push :");
                            int element = sc.nextInt();
                            stack1.push(element);
                            System.out.println("Element "+element+" added to the stack");
                            break;
                case 2 : if(stack1.isEmpty()){
                            System.out.println("Stack is Underflow can't Popped element");
                        }else{
                            System.out.println("Popped element is : "+stack1.pop());
                        }
                        break;
                case 3 : if(stack1.isEmpty()){
                            System.out.println("Stack is Empty");
                        }else{
                            System.out.println("Current Stack is : "+stack1);
                        }
                        break;
                case 4 : System.out.println("Exiting Program");
                            break;

                default : System.out.println("Invail Choice please try again");
                            break;
            }
        }while(choice != 4);
        sc.close();
    }
}
