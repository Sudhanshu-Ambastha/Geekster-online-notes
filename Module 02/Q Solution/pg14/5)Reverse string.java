import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        String ans = "";
        while (st.size() > 0) {
            char ch = st.peek();
            st.pop();

            ans = ans + ch;
        }
        return ans;
    }
}