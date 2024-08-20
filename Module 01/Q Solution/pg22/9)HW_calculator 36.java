import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        addNumber(arr, X);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void addNumber(int[] arr, int X) {
        int carry = X;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break;
            }
        }
        if (carry > 0) {
            System.out.print(carry + " ");
        }
    }
}