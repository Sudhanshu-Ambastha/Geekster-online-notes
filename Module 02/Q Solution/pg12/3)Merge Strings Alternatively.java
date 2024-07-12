import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
        }
        System.out.println(result.toString());
    }
}