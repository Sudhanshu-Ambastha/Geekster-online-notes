import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col += 2) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}