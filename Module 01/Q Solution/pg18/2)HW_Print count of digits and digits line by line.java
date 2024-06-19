import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        // Count of digits
        int count = Long.toString(number).length();
        System.out.println(count);

        // Print digits from least significant to most significant
        while (number > 0) {
            System.out.println(number % 10);
            number /= 10;
        }
    }
}