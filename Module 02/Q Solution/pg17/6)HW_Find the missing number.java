import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Read N
        int L = scanner.nextInt(); // Read L
        int R = scanner.nextInt(); // Read R

        Set<Integer> presentNumbers = new HashSet<>();

        // Read N integers and add them to the set to avoid duplicates
        for (int i = 0; i < N; i++) {
            presentNumbers.add(scanner.nextInt());
        }

        // Find missing elements in the range [L, R]
        List<Integer> missingNumbers = findMissingNumbers(presentNumbers, L, R);

        // Print the result
        printMissingNumbers(missingNumbers);
    }

    private static List<Integer> findMissingNumbers(Set<Integer> presentNumbers, int L, int R) {
        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = L; i <= R; i++) {
            if (!presentNumbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    private static void printMissingNumbers(List<Integer> missingNumbers) {
        if (missingNumbers.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int number : missingNumbers) {
                System.out.print(number + " ");
            }
            System.out.println(); // To ensure there's a new line after the output
        }
    }
}