import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        System.out.println(isToggle(s1, s2));
    }

    public static boolean isToggle(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (Character.isUpperCase(c1) && !Character.isUpperCase(c2)) {
                if (Character.toLowerCase(c1) != c2) {
                    return false;
                }
            } else if (Character.isLowerCase(c1) && !Character.isLowerCase(c2)) {
                if (Character.toUpperCase(c1) != c2) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}