import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            if (set2.contains(-arr1[i])) {
                System.out.print(arr1[i] + " ");
            }
        }

        scanner.close();
    }
}