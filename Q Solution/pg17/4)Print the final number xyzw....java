import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();

        // Ensure n is within the constraints
        if (n >= 1 && n <= 8) {
            int number = 0;
            for (int i = 0; i < n; i++) {
                int digit = scanner.nextInt();
                number = number * 10 + digit;
            }
            System.out.println("" + number);
        } else {
            System.out.println("The value of 'n' is out of the allowed range.");
        }

        scanner.close();
    }
}