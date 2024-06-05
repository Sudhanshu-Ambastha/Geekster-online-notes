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

        int maxDiff = Integer.MIN_VALUE;
        int minElement = arr[0];

        for (int i = 1; i < N; i++) {
            int currentDiff = arr[i] - minElement;
            maxDiff = Math.max(maxDiff, currentDiff);
            minElement = Math.min(minElement, arr[i]);
        }

        System.out.println(maxDiff);
    }
}