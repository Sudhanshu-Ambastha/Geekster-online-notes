import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            arr.add(val);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}