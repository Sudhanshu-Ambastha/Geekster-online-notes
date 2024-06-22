import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(scanner.nextInt());
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }

        System.out.println(result);
    }
}