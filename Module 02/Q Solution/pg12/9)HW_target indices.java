import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        List<Integer> targetIndices = findTargetIndices(nums, target);

        if (targetIndices.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int index : targetIndices) {
                System.out.print(index + " ");
            }
        }
    }

    public static List<Integer> findTargetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> targetIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndices.add(i);
            }
        }
        return targetIndices;
    }
}
