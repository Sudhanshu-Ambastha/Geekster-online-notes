import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input
        int m = scanner.nextInt();
        // Generate the pattern
        int lines = m / 2 + 1; // Total number of lines in the first half (including middle line)
        // Print the top half of the pattern
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < m - 2 * i; j++) {
                System.out.print("*");
                if (j < m - 2 * i - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        // Print the bottom half of the pattern
        for (int i = lines - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < m - 2 * i; j++) {
                System.out.print("*");
                if (j < m - 2 * i - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}