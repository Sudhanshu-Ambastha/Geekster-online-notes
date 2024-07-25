import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(evaluatePostfix(str));
    }

    private static int evaluatePostfix(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (ch) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}