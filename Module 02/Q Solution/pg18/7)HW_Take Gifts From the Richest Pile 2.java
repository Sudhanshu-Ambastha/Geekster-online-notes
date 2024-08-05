import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            gifts[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int result = remainingGifts(gifts, k);
        System.out.println(result);
    }

    public static int remainingGifts(int[] gifts, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);

        // Add all the gifts to the max heap
        for (int gift : gifts) {
            max.add(gift);
        }

        // Perform k operations
        for (int i = 0; i < k; i++) {
            if (!max.isEmpty()) {
                int maxGifts = max.poll(); // Get the pile with the maximum gifts
                int remainingGifts = (int) Math.floor(Math.sqrt(maxGifts)); // Calculate remaining gifts
                max.add(remainingGifts); // Put the remaining gifts back to the heap
            }
        }

        // Calculate the total remaining gifts
        int totalRemaining = 0;
        while (!max.isEmpty()) {
            totalRemaining += max.poll();
        }

        return totalRemaining;
    }
}