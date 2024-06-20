import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sortArrayInDescendingOrder(arr);
    }

    public static void sortArrayInDescendingOrder(Integer[] arr) {
        // Sort the array in descending order
        Arrays.sort(arr, (a, b) -> b.compareTo(a));

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}