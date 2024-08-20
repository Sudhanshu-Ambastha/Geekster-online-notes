import java.io.*;
import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int secondLargest = findSecondLargest(A, B, C);

        System.out.println(secondLargest);

        scanner.close();
    }

    public static int findSecondLargest(int A, int B, int C) {

        int max = Math.max(A, Math.max(B, C));

        int min = Math.min(A, Math.min(B, C));

        int middle = A + B + C - max - min;

        return middle;
    }
}