import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        scanner.close();

        printPowersOf17(n);
    }

    public static void printPowersOf17(int n) {
        long result = 1; // Initialize with 17^0 = 1
        for (int i = 1; i <= n; i++) {
            result *= 17; // Calculate the next power of 17
            System.out.print(result + " ");
        }
    }
}
