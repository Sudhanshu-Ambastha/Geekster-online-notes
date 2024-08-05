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

        int K = scanner.nextInt();

        int result = kthSmallest(arr, K);
        System.out.println(result);

    }

    public static int kthSmallest(int[] arr, int K) {
        Arrays.sort(arr);
        return arr[K - 1];
    }
}