// Implement a function to find all permutations of a string.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutations {
    
    private static void generatePermutations(String prefix, String str, List<String> result) {
        int n = str.length();
        if (n == 0) {
            result.add(prefix);  
        } else {
            for (int i = 0; i < n; i++) {
                
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string (max 8 characters): ");
        String input = scanner.nextLine();

        
        if (input.length() > 8) {
            System.out.println("Input string is too long. Please enter a string with 8 characters or fewer.");
        } else {
            List<String> permutations = new ArrayList<>();
            generatePermutations("", input, permutations);

            
            System.out.println("All permutations of the string:");
            for (String permutation : permutations) {
                System.out.println(permutation);
            }
        }

        scanner.close();
    }
}