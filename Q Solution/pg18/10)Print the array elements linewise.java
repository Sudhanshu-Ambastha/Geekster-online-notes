import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the array

        // Declare an array of size n
        int[] arr = new int[n];

        // Take n integer inputs and store them in the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print each integer in a separate line
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}