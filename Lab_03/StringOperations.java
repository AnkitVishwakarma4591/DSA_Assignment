// Perform basic string operations like concatenation and substring extraction in Java.
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        int startIndex = 0;
        while (true) {
            System.out.print("Enter the starting index for substring extraction: ");
            if (scanner.hasNextInt()) {
                startIndex = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        int endIndex = 0;
        while (true) {
            System.out.print("Enter the ending index for substring extraction: ");
            if (scanner.hasNextInt()) {
                endIndex = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            }
        }

        if (startIndex >= 0 && endIndex <= concatenatedString.length() && startIndex <= endIndex) {
            String substring = concatenatedString.substring(startIndex, endIndex);
            System.out.println("Extracted Substring: " + substring);
        } else {
            System.out.println("Invalid indices. Please enter valid starting and ending indices.");
        }

        scanner.close();
    }
}