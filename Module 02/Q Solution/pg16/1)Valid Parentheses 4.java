import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(validPara(str));
    }

    public static boolean validPara(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                st.push(curr);
            } else {
                if (st.size() == 0) {
                    return false; // No opening bracket for this closing
                }

                if (curr == ')' && st.peek() == '(') {
                    st.pop();
                } else if (curr == ']' && st.peek() == '[') {
                    st.pop();
                } else if (curr == '}' && st.peek() == '{') {
                    st.pop();
                }
            }
        }

        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}