import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        int n = scn.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next().charAt(0);
        }
        charByFreq(arr, n);
    }

    public static void charByFreq(char[] arr, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Character> ans = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            ans.add(key);
        }
        Collections.sort(ans);
        for (char i : ans) {
            System.out.println(i + " " + map.get(i));
        }
    }
}