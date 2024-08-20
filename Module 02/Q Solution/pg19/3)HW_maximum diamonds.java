import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println(maxDiamonds(N, K, A));
    }

    public static int maxDiamonds(int N, int K, int[] A) {
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a);

        // Add all diamond counts to the max-heap
        for (int diamonds : A) {
            max.offer(diamonds);
        }

        int totalDiamonds = 0;
        // Perform the K operations (or until the heap is empty)
        for (int i = 0; i < K && !max.isEmpty(); i++) {
            int maxDiamonds = max.poll(); // Get the bag with the most diamonds
            totalDiamonds += maxDiamonds; // Collect the diamonds

            // Calculate the new number of diamonds and add back to the heap
            int newDiamonds = maxDiamonds / 2; // this is the floor division

            if (newDiamonds > 0) {
                max.offer(newDiamonds); // Add the new state of diamonds back to the heap
            }
        }

        return totalDiamonds;
    }
}