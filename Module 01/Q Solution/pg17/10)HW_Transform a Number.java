import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Extracting the last 2 digits of the number
        int lastTwoDigits = n % 100;

        // Removing the last 2 digits from the number
        n = n / 100;

        // Shifting the last 2 digits to the beginning
        int transformedNumber = Integer.parseInt(String.valueOf(lastTwoDigits) + String.valueOf(n));

        System.out.println(transformedNumber);
    }
}