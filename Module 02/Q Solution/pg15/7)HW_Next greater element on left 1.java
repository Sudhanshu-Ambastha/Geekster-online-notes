import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] ans = nextGreaterElements(arr, n);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] nextGreaterElements(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}