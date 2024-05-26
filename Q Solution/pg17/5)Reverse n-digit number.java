import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Ensure n is within the constraints
        if (n >= 1 && n <= 8) {
            int formedNumber = 0;
            for (int i = 0; i < n; i++) {
                int digit = scanner.nextInt();
                formedNumber = formedNumber * 10 + digit;
            }

            System.out.println("" + formedNumber);

            int reversedNumber = 0;
            while (formedNumber > 0) {
                int lastDigit = formedNumber % 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
                formedNumber /= 10;
            }

            System.out.println("" + reversedNumber);
        } else {
            System.out.println("The value of 'n' is out of the allowed range.");
        }

        scanner.close();
    }
}