import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int rotatedNumber = rotateInteger(N, K);
        System.out.println(rotatedNumber);
    }

    public static int rotateInteger(int N, int K) {
        String N_str = Integer.toString(N);
        int length = N_str.length();

        if (K > 0) {
            // Left rotation
            String rotatedStr = N_str.substring(K) + N_str.substring(0, K);
            return Integer.parseInt(rotatedStr);
        } else if (K < 0) {
            // Right rotation
            K = Math.abs(K);
            String rotatedStr = N_str.substring(length - K) + N_str.substring(0, length - K);
            return Integer.parseInt(rotatedStr);
        } else {
            // No rotation
            return N;
        }
    }
}