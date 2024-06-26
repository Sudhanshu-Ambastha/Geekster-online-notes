import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int N = sc.nextInt();
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }

        // Expected heights array
        int[] expected = new int[N];
        System.arraycopy(heights, 0, expected, 0, N);
        Arrays.sort(expected);

        // Calculate number of mismatched indices
        int mismatchCount = 0;
        for (int i = 0; i < N; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }

        System.out.println(mismatchCount);
    }
}