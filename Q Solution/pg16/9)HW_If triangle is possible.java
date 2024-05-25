import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for sides A, B, and C
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Check if the sides form a valid triangle
        boolean isValid = isValidTriangle(A, B, C);

        // Print the result
        System.out.println("" + isValid);

        scanner.close();
    }

    // Function to check triangle validity
    public static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
