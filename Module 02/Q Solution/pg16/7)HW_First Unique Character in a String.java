import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (freqMap.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}