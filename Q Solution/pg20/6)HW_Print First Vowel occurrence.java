import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        int firstVowelIndex = findFirstVowelIndex(arr);
        System.out.println(firstVowelIndex);
    }

    public static int findFirstVowelIndex(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            char ch = Character.toLowerCase(arr[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1;
    }
}