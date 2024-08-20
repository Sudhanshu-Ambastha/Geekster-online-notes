import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        twoSum(arr, n, target);
    }

    public static void twoSum(int[] arr, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < n; i++) {
            int num1 = arr[i];
            int num2 = target - num1;

            if (map.containsKey(num2) == true) {
                if (i != map.get(num2)) {
                    System.out.println(i + " " + map.get(num2));
                    break;
                }
            }
        }
    }
}