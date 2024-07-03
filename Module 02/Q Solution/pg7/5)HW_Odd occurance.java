import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int freq[] = new int[10];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            freq[num]++;
        }

        int oddelem = -1;
        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
                oddelem = i;
                break;
            }
        }

        if (oddelem == -1) {
            System.out.print("There is no odd occurring element");
        } else {
            System.out.print(oddelem);
        }

        scanner.close();
    }
}