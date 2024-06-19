import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for the size of the array
        int n = input.nextInt();

        // Declaring an array of size n
        int[] arr = new int[n];

        // Taking input for the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Printing the indexes of the array where the elements are odd
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}