import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the value of 'n'
        int n = scanner.nextInt();

        // Validate input constraints
        if (n >= 1 && n <= 1000000) {
            // Print the series: n, n-5, n-10, n-15, ...
            while (n > 0) {
                System.out.print(n + " ");
                n -= 5; // Decrement by 5 for the next term
            }
        } else {
            System.out.println("Invalid input. Please enter a value within the specified range.");
        }

        scanner.close();
    }
}