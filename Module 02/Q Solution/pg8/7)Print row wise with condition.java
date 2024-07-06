import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // Number of rows
        int n = scanner.nextInt(); // Number of columns
        int[][] matrix = new int[m][n];

        // Input matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) { // Even row
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else { // Odd row
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}