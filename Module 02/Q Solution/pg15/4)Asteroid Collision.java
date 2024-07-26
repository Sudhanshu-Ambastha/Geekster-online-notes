import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<Integer> result = asteroidCollision(arr, n);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static List<Integer> asteroidCollision(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                st.push(arr[i]);
            } else {
                while (st.size() > 0 && st.peek() > 0 && st.peek() < (-1 * arr[i])) {
                    st.pop();
                }
                if (st.size() > 0 && st.peek() == -1 * arr[i]) {
                    st.pop();
                } else if (st.size() == 0 || st.peek() < 0) {
                    st.push(arr[i]);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (st.size() > 0) {
            int top = st.peek();
            st.pop();

            ans.add(0, top);
        }
        return ans;
    }
}