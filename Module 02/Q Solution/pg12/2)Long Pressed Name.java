import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String typed = scn.next();
        System.out.println(longPressed(str, typed));
    }

    public static boolean longPressed(String str, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < str.length() && str.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        if (i == str.length()) {
            return true;
        } else {
            return false;
        }
    }
}