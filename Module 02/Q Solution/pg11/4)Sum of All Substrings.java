import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();
        System.out.println(sumOfSubstings(str, n));
    }

    public static long sumOfSubstings(String str, int n) {
        long sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                sum += Long.parseLong(str.substring(i, j));
            }
        }

        return sum;
    }
}