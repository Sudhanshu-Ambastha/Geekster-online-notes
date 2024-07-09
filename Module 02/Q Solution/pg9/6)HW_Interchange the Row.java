import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); // Number of rows
        int N = sc.nextInt(); // Number of columns

        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Interchange elements of the first and last row
        for (int i = 0; i < N; i++) {
            int temp = matrix[0][i];
            matrix[0][i] = matrix[M - 1][i];
            matrix[M - 1][i] = temp;
        }

        // Print the modified matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}