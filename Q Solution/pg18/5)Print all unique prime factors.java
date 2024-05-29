import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        Set<Integer> primeFactors = getPrimeFactors(N);
        for (int factor : primeFactors) {
            System.out.println(factor);
        }
    }

    private static Set<Integer> getPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();
        // Check for number of 2s that divide number
        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }
        // number must be odd at this point, so a skip of 2 (i = i + 2) can be used
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, add i and divide number
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }
        // This condition is to check if number is a prime number greater than 2
        if (number > 2) {
            primeFactors.add(number);
        }
        return primeFactors;
    }
}