import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(s.nextInt());
        }
        int mid = n / 2;
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < mid; i++) {
            temp.push(stack.pop());
        }
        stack.pop();

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        List<Integer> elem = new ArrayList<>(stack);

        for (int i : elem) {
            System.out.print(i + " ");
        }
    }
}