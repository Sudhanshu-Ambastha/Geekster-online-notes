import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for (char c : str.toCharArray()) {
            count[c - 'a']++;
            if (count[c - 'a'] == 1) {
                queue.add(c);
            }
            while (!queue.isEmpty() && count[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
        }

        if (queue.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(queue.peek());
        }
    }
}