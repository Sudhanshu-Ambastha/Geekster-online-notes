import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        scanner.close();

        long result = nthPowerOf2(n);
        System.out.println("" + result);
    }

    public static long nthPowerOf2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("");
        }
        return (long) Math.pow(2, n);
    }
}