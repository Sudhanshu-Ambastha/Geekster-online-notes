import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        searchInMatrix(m, n, matrix, x);
    }

    public static void searchInMatrix(int m, int n, int[][] matrix, int x) {
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == x) {
                System.out.println(row);
                System.out.println(col);
                return;
            } else if (matrix[row][col] < x) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Not Found");
    }
}
