import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); // Number of rows
        int N = scanner.nextInt(); // Number of columns

        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < N; j++) {
            if (j % 2 == 0) { // Even column
                for (int i = 0; i < M; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else { // Odd column
                for (int i = M - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}