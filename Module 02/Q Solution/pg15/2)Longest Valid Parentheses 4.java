import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(validPara(str));
    }

    public static int validPara(String str) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (curr == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }
}