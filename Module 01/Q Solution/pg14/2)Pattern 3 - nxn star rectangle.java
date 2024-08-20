import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();

        // Ensure 'n' is within the constraints
        if (n >= 0 && n <= Integer.MAX_VALUE) {
            for (int i = 0; i < n; i++) { // Loop for each line
                for (int j = 0; j < n; j++) { // Loop for each star in a line
                    System.out.print("*");
                }
                System.out.println(); // New line after each row
            }
        } else {
            System.out.println("The value of 'n' is out of the allowed range.");
        }

        scanner.close();
    }
}