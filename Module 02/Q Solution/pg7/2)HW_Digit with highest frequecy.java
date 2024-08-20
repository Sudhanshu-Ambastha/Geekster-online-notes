import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] frequency = new int[10];

        while (num > 0) {
            frequency[num % 10]++;
            num /= 10;
        }

        int maxDigit = 0;
        int maxFreq = frequency[0];

        for (int i = 1; i < 10; i++) {
            if (frequency[i] > maxFreq) {
                maxDigit = i;
                maxFreq = frequency[i];
            }
        }

        System.out.println(maxDigit);
    }
}