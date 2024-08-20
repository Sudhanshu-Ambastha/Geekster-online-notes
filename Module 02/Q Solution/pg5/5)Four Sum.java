import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        findUniqueQuadruples(arr, target);
    }

    public static void findUniqueQuadruples(int[] arr, int target) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue; // Skip duplicates
                }
                int left = j + 1;
                int right = arr.length - 1;

                do {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[left] + " " + arr[right]);
                        do {
                            left++;
                        } while (left < right && arr[left] == arr[left - 1]);
                        do {
                            right--;
                        } while (left < right && arr[right] == arr[right + 1]);
                    } else if (sum < target) {
                        do {
                            left++;
                        } while (left < right && arr[left] == arr[left - 1]);
                    } else {
                        do {
                            right--;
                        } while (left < right && arr[right] == arr[right + 1]);
                    }
                } while (left < right);
            }
        }
    }
}