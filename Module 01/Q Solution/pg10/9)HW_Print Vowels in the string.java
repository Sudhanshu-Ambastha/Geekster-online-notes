import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String input = scanner.nextLine();
        scanner.close();

        printVowels(input);
    }

    public static void printVowels(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " ");
            }
        }
    }
}
