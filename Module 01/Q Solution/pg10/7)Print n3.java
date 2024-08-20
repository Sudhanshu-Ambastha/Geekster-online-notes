import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int n = scanner.nextInt();
        scanner.close();

        while (n > 0) {
            System.out.print(n + " ");
            n /= 3; // Update n by dividing it by 3
        }
    }
}
