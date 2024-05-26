import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = (n + 1) / 2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*\t"); // Printing spaces
                } else {
                    System.out.print("\t"); // Printing "*"
                }
            }
            System.out.println();
        }
    }
}