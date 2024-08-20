import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        duplicateZeros(arr);

        // Print the modified array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                z++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i + z < n) {
                arr[i + z] = arr[i];
            }
            if (arr[i] == 0) {
                z--;
                if (i + z < n) {
                    arr[i + z] = 0;
                }
            }
        }
    }
}