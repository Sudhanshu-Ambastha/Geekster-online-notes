import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Convert int array to Integer array for sorting
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

        // Custom comparator to compare numbers as strings for smallest number
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String first = String.valueOf(a) + String.valueOf(b);
                String second = String.valueOf(b) + String.valueOf(a);
                return first.compareTo(second);
            }
        });

        StringBuilder smallestNumber = new StringBuilder();
        for (int num : nums) {
            smallestNumber.append(num);
        }

        System.out.println(smallestNumber.toString());
    }
}