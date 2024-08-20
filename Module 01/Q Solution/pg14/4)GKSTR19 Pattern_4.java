import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int N = scanner.nextInt();

        // Ensure N is within the constraints
        if (N >= 1 && N <= 100) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Move to the next line
            }
        } else {
            System.out.println("The value of N is out of the allowed range.");
        }

        scanner.close();
    }
}