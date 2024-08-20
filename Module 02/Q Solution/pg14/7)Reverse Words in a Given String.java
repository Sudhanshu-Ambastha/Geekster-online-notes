import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str) {
        String[] arr = str.split(" ");
        Stack<String> st = new Stack<>();

        for (String s : arr) {
            st.push(s);
        }

        String ans = "";
        while (st.size() > 0) {
            String top = st.peek();
            st.pop();

            ans += top + " ";
        }
        return ans;
    }
}