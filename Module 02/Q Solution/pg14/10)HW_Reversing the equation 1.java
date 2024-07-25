import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String eq = s.nextLine();

        Stack<String> st = new Stack<>();
        StringBuilder number = new StringBuilder();

        // tranverse string push elem in stack
        for (int i = 0; i < eq.length(); i++) {
            char c = eq.charAt(i); // current

            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    st.push(number.toString());
                    number.setLength(0);
                }
                st.push(Character.toString(c));
            }
        }

        // for the remaining number
        if (number.length() > 0) {
            st.push(number.toString());
        }

        StringBuilder result = new StringBuilder();

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        System.out.println(result.toString());
    }
}