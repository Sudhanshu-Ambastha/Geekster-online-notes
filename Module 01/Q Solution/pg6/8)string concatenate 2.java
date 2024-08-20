import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 > len2) {
            String ans = str2 + str1 + str2;
            System.out.println(ans);
        } else {
            String ans = str1 + str2 + str1;
            System.out.println(ans);
        }
    }
}