import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            if (n == 1) {
                printSize(arr);
            } else if (n == 2) {
                removeLastIndex(arr);
            } else if (n == 3) {
                int x = scn.nextInt();
                addAtLastIndex(arr, x);
            } else if (n == 4) {
                removeFirstIndex(arr);
            } else if (n == 5) {
                int x = scn.nextInt();
                addElementAtBeginning(arr, x);
            } else if (n == 6) {
                print(arr);
            }
        }
    }

    public static void printSize(ArrayList<Integer> arr) {
        System.out.println(arr.size());
    }

    public static void removeLastIndex(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            System.out.println("invalid-move");
            return;
        }
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        System.out.println(val);
    }

    public static void addAtLastIndex(ArrayList<Integer> arr, int x) {
        arr.add(x);
        System.out.println(x);
    }

    public static void removeFirstIndex(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            System.out.println("invalid-move");
            return;
        }
        int val = arr.get(0);
        arr.remove(0);
        System.out.println(val);
    }

    public static void addElementAtBeginning(ArrayList<Integer> arr, int x) {
        arr.add(0, x);
        System.out.println(x);
    }

    public static void print(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            System.out.println("invalid-move");
            return;
        }
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}