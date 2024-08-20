import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(isGoodString(str));
    }

    public static boolean isGoodString(String str) {
        int[] charCounts = new int[26]; // Array to store the counts of each lowercase letter

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c - 'a']++; // Increment the count of the corresponding character in the array
        }

        int firstCount = 0;
        boolean firstNonZero = false;

        // Find the first non-zero count
        for (int count : charCounts) {
            if (count > 0) {
                firstCount = count;
                firstNonZero = true;
                break;
            }
        }

        // Check if all other counts match the first non-zero count
        for (int count : charCounts) {
            if (count > 0 && count != firstCount) {
                return false;
            }
        }

        return firstNonZero;
    }
}