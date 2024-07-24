import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        System.out.println(deleteConsecutive(arr, n));
    }

    public static int deleteConsecutive(String[] arr, int n) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek().equals(arr[i]) == false) {
                st.push(arr[i]);
            } else {
                st.pop();
            }
        }
        return st.size();
    }
}