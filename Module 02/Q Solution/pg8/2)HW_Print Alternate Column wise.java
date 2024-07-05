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

        for (int j = 0; j < n; j += 2) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}