import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("");
            int number = scanner.nextInt();
            System.out.print(number % 2 == 0 ? "Even" : "Odd");
            System.out.println(number % 3 == 0 ? " Divisible by 3" : " Not Divisible by 3");
        }

        scanner.close();
    }
}