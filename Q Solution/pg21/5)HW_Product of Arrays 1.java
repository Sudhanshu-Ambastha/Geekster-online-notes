import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        long product = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            product *= arr[i];
        }

        System.out.println(product);
    }
}