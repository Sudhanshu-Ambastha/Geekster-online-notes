import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt(); // Input integer

            if (isPrime(num)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, not prime
            }
        }
        return true; // Otherwise, it's prime
    }
}