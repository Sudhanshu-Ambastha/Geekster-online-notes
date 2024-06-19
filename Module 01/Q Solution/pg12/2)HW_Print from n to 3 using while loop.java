import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the value of 'n'
        System.out.print("");
        int n = scanner.nextInt();

        // Validate input constraints
        if (n >= -100 && n < 3) {
            // Print numbers from 'n' to 3
            while (n < 3) {
                System.out.println(n);
                n++;
            }
        } else {
            System.out.println("Invalid input. Please enter a value within the specified range.");
        }

        scanner.close();
    }
}