import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        Arrays.sort(nums);
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]);

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                queue.offer(new int[] { count, nums[i - 1] });
                count = 1;
            }
        }
        queue.offer(new int[] { count, nums[n - 1] });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll()[1];
        }

        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
}