import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        scanner.close();

        printPowersOf2(n);
    }

    public static void printPowersOf2(int n) {
        int highestPower = highestPowerOf2(n);
        for (int i = 1; i <= highestPower; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public static int highestPowerOf2(int n) {
        int res = 0;
        for (int i = n; i >= 1; i--) {
            if ((i & (i - 1)) == 0) {
                res = i;
                break;
            }
        }
        return res;
    }
}