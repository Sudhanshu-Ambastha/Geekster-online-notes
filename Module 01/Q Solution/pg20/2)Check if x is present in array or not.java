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

        int target = scn.nextInt();

        findTarget(n, arr, target);
    }

    public static void findTarget(int n, int[] arr, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }
}