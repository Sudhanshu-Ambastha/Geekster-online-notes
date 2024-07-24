import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            if (n == 1) {
                printSize(st);
            } else if (n == 2) {
                removeTopElement(st);
            } else if (n == 3) {
                int x = scn.nextInt();
                addElement(st, x);
            } else if (n == 4) {
                printTopElement(st);
            }
        }
    }

    public static void printSize(Stack<Integer> st) {
        System.out.println(st.size());
    }

    public static void removeTopElement(Stack<Integer> st) {
        if (st.size() == 0) {
            System.out.println("-1");
            return;
        }
        st.pop();
    }

    public static void addElement(Stack<Integer> st, int x) {
        st.push(x);
    }

    public static void printTopElement(Stack<Integer> st) {
        if (st.size() == 0) {
            System.out.println("-1");
            return;
        }
        int val = st.peek();
        System.out.println(val);
    }
}