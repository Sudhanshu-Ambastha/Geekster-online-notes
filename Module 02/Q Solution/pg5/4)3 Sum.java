import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        targetTriplets(arr, arr.length);
    }

    public static void targetTriplets(int[] arr, int n) {
        Arrays.sort(arr);
        for (int k = 0; k < n; k++) {
            int i = k + 1;
            int j = n - 1;
            int target = -1 * arr[k];
            while (i < j) {
                int sum = arr[i] + arr[j];
                if (sum < target) {
                    i++;
                } else if (sum > target) {
                    j--;
                } else if (sum == target) {
                    System.out.println(arr[k] + " " + arr[i] + " " + arr[j]);
                    i++;
                    j--;
                    while (i < j && arr[i] == arr[i - 1]) {
                        i++;
                    }
                    while (i < j && arr[j] == arr[j + 1]) {
                        j--;
                    }
                }
            }
            while (k + 1 < n && arr[k] == arr[k + 1]) {
                k++;
            }
        }
    }
}