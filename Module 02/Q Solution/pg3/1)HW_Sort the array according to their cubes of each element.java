import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        cubeSort(arr);

        for (int num : arr) {
            System.out.print((int) Math.cbrt(num) + " ");
        }
    }

    public static void cubeSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i] * arr[i];
        }
        Arrays.sort(arr);
    }
}
