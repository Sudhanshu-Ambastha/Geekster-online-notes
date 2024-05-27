import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt(); // input number for the current test case
            int reversedNumber = reverseDigits(n);
            System.out.println(reversedNumber);
        }
    }

    public static int reverseDigits(int n) {
        int reversedNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        return reversedNumber;
    }
}