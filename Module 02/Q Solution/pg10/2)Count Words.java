import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(countWords(str));
    }

    public static int countWords(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == ' ' && prev != ' ') {
                count++;
            }
        }
        return count + 1;
    }
}