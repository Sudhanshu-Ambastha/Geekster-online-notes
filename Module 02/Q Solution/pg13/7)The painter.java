import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] boards = new int[n];
        for (int i = 0; i < n; i++) {
            boards[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        // To find the minimum time required
        System.out.println(findMinimumTime(boards, k));
        scn.close();
    }

    public static int findMinimumTime(int[] boards, int k) {
        int maxBoardLength = 0;
        int totalLength = 0;

        // Find total length and maximum board length
        for (int board : boards) {
            totalLength += board;
            maxBoardLength = Math.max(maxBoardLength, board);
        }

        // Binary search for the answer
        int left = maxBoardLength; // Lower bound (max single board)
        int right = totalLength; // Upper bound (total length of boards)

        while (left < right) {
            int mid = (left + right) / 2;
            if (canPaintInTime(boards, k, mid)) {
                right = mid; // Try for a lower time
            } else {
                left = mid + 1; // Increase the time
            }
        }

        return left; // Minimum time found
    }

    public static boolean canPaintInTime(int[] boards, int k, int mid) {
        int paintersRequired = 1;
        int currentSum = 0;

        for (int board : boards) {
            currentSum += board;
            if (currentSum > mid) {
                // If the current painter exceeds the allowed time
                paintersRequired++;
                currentSum = board; // Assign this board to the new painter

                // If number of painters exceeds k, return false
                if (paintersRequired > k) {
                    return false;
                }
            }
        }

        return true; // Can paint with given painters in time mid
    }
}