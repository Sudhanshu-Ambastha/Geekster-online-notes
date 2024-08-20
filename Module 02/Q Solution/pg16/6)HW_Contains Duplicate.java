import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        HashSet<Integer> seen = new HashSet<>();

        boolean duplicate = false;
        for (int i = 0; i < n; i++) {
            int num = scn.nextInt();

            if (seen.contains(num)) {
                duplicate = true;
                break;
            } else {
                seen.add(num);
            }
        }
        if (duplicate) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}