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

        int[] counts = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            counts[i] = count;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(counts[i] + " ");
        }
    }
}