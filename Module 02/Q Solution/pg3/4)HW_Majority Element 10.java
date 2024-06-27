import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the size of the array
        int N = scanner.nextInt();
        // Read the elements of the array
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        // Sort the array
        Arrays.sort(array);
        // Determine the threshold for the majority element
        int threshold = (N + 1) / 2;
        int currentElement = array[0];
        int count = 1;
        int majorityElement = array[0];
        boolean foundMajority = false;
        // Iterate over the sorted array to find the majority element
        for (int i = 1; i < N; i++) {
            if (array[i] == currentElement) {
                count++;
            } else {
                if (count >= threshold) {
                    if (!foundMajority || currentElement > majorityElement) {
                        majorityElement = currentElement;
                        foundMajority = true;
                    }
                }
                currentElement = array[i];
                count = 1;
            }
        }
        // Check the last element count
        if (count >= threshold) {
            if (!foundMajority || currentElement > majorityElement) {
                majorityElement = currentElement;
                foundMajority = true;
            }
        }
        // Print the result
        if (foundMajority) {
            System.out.println(majorityElement);
        } else {
            System.out.println("NO MAJORITY ELEMENT");
        }
    }
}