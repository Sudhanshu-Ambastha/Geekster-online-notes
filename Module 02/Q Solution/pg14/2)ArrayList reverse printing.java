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
        printReverse(arr);
    }

    public static void printReverse(ArrayList<Integer> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}