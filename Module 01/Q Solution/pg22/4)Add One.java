import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] result = addOne(arr);
        printArray(result);
    }

    public static int[] addOne(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        
        int[] newArr = new int[n + 1];
        newArr[0] = 1;
        return newArr;
        }
    
    public static void printArray(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}