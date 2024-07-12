import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        String typed = scn.next();
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        return i == name.length();
    }
}