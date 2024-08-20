import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Declare an array of characters
        char[] charArray = new char[n];

        // Read n character inputs and store them in the array
        for (int i = 0; i < n; i++) {
            charArray[i] = scanner.nextLine().charAt(0);
        }

        // Traverse the array from the last element
        for (int i = n - 1; i >= 0; i--) {
            char currentChar = charArray[i];
            if (!isVowel(currentChar)) {
                // Found the first consonant
                System.out.println(i);
                break;
            }
        }

        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}