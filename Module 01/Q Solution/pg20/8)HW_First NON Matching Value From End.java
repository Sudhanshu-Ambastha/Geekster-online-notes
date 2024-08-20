import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }

        int nonMatchingIndex = findNonMatchingIndex(arr1, arr2);
        System.out.println(nonMatchingIndex);
    }

    public static int findNonMatchingIndex(int[] arr1, int[] arr2) {
        int nonMatchingIndex = -1;
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (arr1[i] != arr2[i]) {
                nonMatchingIndex = i;
                break;
            }
        }
        return nonMatchingIndex;
    }
}