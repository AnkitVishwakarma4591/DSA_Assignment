/*
Implement a stack data structure in Java language. 
You will need to create a stack that can perform basic operations 
such as push, pop, check the top element, check if the stack is empty, 
and check if the stack is full. 

Additionally, you will write a program that allows the user to interact with 
the stack through a menu-driven interface.

Example:
Input: Enter the stack size: 5

Menu Display:
Stack Operations Menu:
Push
Pop
Top Element
Check if Empty
Check if Full
Exit
Enter your choice: 1

Enter the element to push: 10


Menu Display:

Stack Operations Menu:
Push
Pop
Top Element
Check if Empty
Check if Full
Exit
Enter your choice: 1

Enter the element to push: 20

Menu Display:

Stack Operations Menu:
Push
Pop
Top Element
Check if Empty
Check if Full
Exit
Enter your choice: 3

Top element: 20

Menu Display:

Stack Operations Menu:
Push
Pop
Top Element
Check if Empty
Check if Full
Exit
Enter your choice: 6

Exiting...
 */

import java.util.Scanner;

// Stack class definition
class Stack {
    private int top;
    private int capacity;
    private int[] arr;

    public Stack(int size) {
        top = -1;
        capacity = size;
        arr = new int[size];
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack overflow. Unable to push " + x);
        } else {
            arr[++top] = x;
            // System.out.println(x + " pushed into the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Nothing to pop.");
            return -1; // Return -1 to indicate an error
        } else {
            return arr[top--];
        }
    }

    public int topElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1; // Return -1 to indicate an error
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, choice, element;

        // Ask the user to input stack size
        System.out.println("Enter the stack size: ");
        size = scanner.nextInt();

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top Element");
            System.out.println("4. Check if Empty");
            System.out.println("5. Check if Full");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    element = stack.pop();
                    if (element != -1) {
                        System.out.println("Popped element: " + element);
                    }
                    break;
                case 3:
                    element = stack.topElement();
                    if (element != -1) {
                        System.out.println("Top element: " + element);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if (stack.isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
