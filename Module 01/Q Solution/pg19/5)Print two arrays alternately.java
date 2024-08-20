import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }

        printArrayAlternatively(n, arr1, arr2);
    }

    public static void printArrayAlternatively(int n, int[] arr1, int[] arr2) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr1[i] + " ");
            } else {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}