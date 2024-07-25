import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Initialize an empty stack
        Stack<Character> s = new Stack<>();

        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Take the number of test cases as input
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Take the case and optional character as input
            String[] input = scanner.nextLine().split(" ");
            int caseNumber = Integer.parseInt(input[0]);

            // Handle each case
            switch (caseNumber) {
                case 1:
                    // Print the size of the stack
                    System.out.println(s.size());
                    break;
                case 2:
                    // Remove an element from the stack if it's not empty
                    if (!s.isEmpty()) {
                        s.pop();
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    // Add the character to the stack
                    s.push(input[1].charAt(0));
                    break;
                case 4:
                    // Print the character at the top of the stack if it's not empty
                    if (!s.isEmpty()) {
                        System.out.println(s.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}