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

        int maxNumberOfOnes = 0;
        int rowWithMaxOnes = -1;

        for (int i = 0; i < m; i++) {
            int countOnes = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxNumberOfOnes) {
                maxNumberOfOnes = countOnes;
                rowWithMaxOnes = i;
            }
        }

        if (maxNumberOfOnes == 0) {
            System.out.println(-1);
        } else {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[rowWithMaxOnes][j] + " ");
            }
        }
    }
}