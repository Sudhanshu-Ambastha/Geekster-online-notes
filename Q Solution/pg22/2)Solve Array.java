import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] indexes = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            indexes[i] = scanner.nextInt();
        }

        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            target[indexes[i]] = numbers[i];
        }

        for (int num : target) {
            System.out.print(num + " ");
        }
    }
}