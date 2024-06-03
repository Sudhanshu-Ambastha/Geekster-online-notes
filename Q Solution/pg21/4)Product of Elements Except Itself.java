import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        prefixProduct[0] = 1;
        suffixProduct[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * arr[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(prefixProduct[i] * suffixProduct[i]);
        }
    }
}