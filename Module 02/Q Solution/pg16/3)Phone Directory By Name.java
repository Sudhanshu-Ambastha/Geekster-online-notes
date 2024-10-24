import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        while (true) {
            int n = scn.nextInt();
            if (n == 1) {
                String word = scn.next();
                String meaning = scn.next();
                map.put(word, meaning);
            } else if (n == 2) {
                String word = scn.next();
                if (map.containsKey(word) == true) {
                    System.out.println(map.get(word));
                } else {
                    System.out.println("-1");
                }
            } else if (n == 3) {
                String word = scn.next();
                map.remove(word);
            } else if (n == 4) {
                break;
            }
        }
        scn.close();
    }
}