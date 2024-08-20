import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int si = 0;
        int ei = str.length() - 1;

        while (si < ei) {
            if (str.charAt(si) != str.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }

        return true;
    }
}