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

        System.out.println(hasSubarrayWithSumOne(arr));
    }

    public static boolean hasSubarrayWithSumOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if (sum == 1) {
                return true;
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}