import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = scanner.nextInt();
        int right = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i <= left; i++) {
            arr[i] += x;
        }

        for (int i = right; i < n; i++) {
            arr[i] += x;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}