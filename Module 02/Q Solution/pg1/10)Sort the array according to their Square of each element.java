
// Earlier Way:-
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr, new myComparator());

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static class myComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b){
            return a*a - b*b;
        }
    }
}

// New Way:-
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            return a * a - b * b;
        });

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}