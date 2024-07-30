import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(validAnagram(str1, str2));
    }

    public static boolean validAnagram(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char curr = str1.charAt(i);
            if (map1.containsKey(curr)) {
                int freq = map1.get(curr);
                map1.put(curr, freq + 1);
            } else {
                map1.put(curr, 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char curr = str2.charAt(i);
            if (map2.containsKey(curr)) {
                int freq = map2.get(curr);
                map2.put(curr, freq + 1);
            } else {
                map2.put(curr, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char key1 = entry.getKey();
            int value1 = entry.getValue();
            if (map2.containsKey(key1) == false) {
                return false;
            }
            if (map2.get(key1) != value1) {
                return false;
            }
        }
        return true;
    }
}