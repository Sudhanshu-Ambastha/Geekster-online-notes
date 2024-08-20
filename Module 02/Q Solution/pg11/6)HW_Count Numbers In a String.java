import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = countNumbersInString(str);
        System.out.println(count);
    }

    public static int countNumbersInString(String str) {
        int count = 0;
        boolean foundNumber = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!foundNumber) {
                    count++;
                    foundNumber = true;
                }
            } else {
                foundNumber = false;
            }
        }
        return count;
    }
}