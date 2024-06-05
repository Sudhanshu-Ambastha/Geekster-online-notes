import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int k = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0 && arr[i] > k) {
                arr[i] /= 2;
            } else if (arr[i] % 2 != 0 && arr[i] > k) {
                arr[i] += k;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}