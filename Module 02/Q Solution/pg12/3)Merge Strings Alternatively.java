import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(merge2Strings(str1, str2));
    }

    public static String merge2Strings(String str1, String str2) {
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            ans = ans + str1.charAt(i) + str2.charAt(i);
        }
        return ans;
    }
}