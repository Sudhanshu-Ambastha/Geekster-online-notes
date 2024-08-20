import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        if (areCircularRotations(mat, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean areCircularRotations(int[][] mat, int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += mat[0][i] + " ";
        }
        for (int i = 1; i < n; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                temp += mat[i][j] + " ";
            }
            if (!isCircularRotation(str, temp)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCircularRotation(String str1, String str2) {
        int n = str1.length();
        String doubleStr = str2 + str2;
        for (int i = 0; i < n; i++) {
            if (doubleStr.substring(i, i + n).equals(str1)) {
                return true;
            }
        }
        return false;
    }
}