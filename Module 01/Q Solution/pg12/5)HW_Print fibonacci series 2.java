import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(a + " ");
            }

            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}