import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String str3 = scn.nextLine();

        String str = str1 + str2 + str3;
        int length = str.length();
        char charAtIndex2 = str.charAt(2);

        System.out.println(length);
        System.out.println(charAtIndex2);
    }
}