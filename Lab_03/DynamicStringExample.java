/*
Implement dynamic strings in Java and analyze their memory representation.

Sample Input:

Enter text to append (or 'exit' to quit): Hello
Enter text to append (or 'exit' to quit): World
Enter text to append (or 'exit' to quit): Java
Enter text to append (or 'exit' to quit): exit

Sample Output:

Initial Capacity: 16
Enter text to append (or 'exit' to quit): Hello
Current String: Hello
Current Length: 5
Current Capacity: 16
Enter text to append (or 'exit' to quit): World
Current String: HelloWorld
Current Length: 10
Current Capacity: 16
Enter text to append (or 'exit' to quit): Java
Current String: HelloWorldJava
Current Length: 14
Current Capacity: 16
Enter text to append (or 'exit' to quit): exit
 */

import java.util.Scanner;

public class DynamicStringExample {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        
        
        System.out.println("Initial Capacity: " + sb.capacity());

        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Enter text to append (or 'exit' to quit): ");

           
            if (!scanner.hasNextLine()) {
                System.out.println("No input found. Exiting.");
                break;
            }

            String input = scanner.nextLine();

           
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting.");
                break;
            }

            
            sb.append(input);

            
            System.out.println("Current String: " + sb.toString());
            System.out.println("Current Length: " + sb.length());
            System.out.println("Current Capacity: " + sb.capacity());
        }

        scanner.close();
    }
}