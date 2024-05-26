import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> multiples = findMultiples(n);
        for (int num : multiples) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findMultiples(int n) {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                multiples.add(i); // Both 3 and 5
            } else if (i % 3 == 0) {
                multiples.add(i); // Only multiple of 3
            } else if (i % 5 == 0) {
                multiples.add(i); // Only multiple of 5
            }
        }
        return multiples;
    }
}
