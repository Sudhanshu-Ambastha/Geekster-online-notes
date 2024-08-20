
//1st way
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);  
        int n = scn.nextInt();  
        int[] piles = new int[n];  
        for(int i = 0; i < n; i++) {  
            piles[i] = scn.nextInt();  
        }  
        int h = scn.nextInt();  
        System.out.println(minEatingSpeed(piles, h));  
    }  

    public static int minEatingSpeed(int[] piles, int h) {  
        int i = 1, j = 1000000000;  
        while(i < j) {  
            int mid = (j + i) / 2;  
            if(canEatAll(piles, h, mid)) {  
                j = mid;  
            } else {  
                i = mid + 1;  
            }  
        }  
        return i;  
    }  

    public static boolean canEatAll(int[] piles, int h, int k) {  
        int hours = 0;  
        for(int pile : piles) {  
            hours += (pile + k - 1) / k;  
        }  
        return hours <= h;  
    }

//2nd way
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
        int hours = scn.nextInt();
        System.out.println(bananaChallenge(arr, n, hours));
    }

    public static int bananaChallenge(int[] arr, int n, int hours) {
        int si = 1;
        int ei = max(arr);
        while (si <= ei) {
            int mid = (si + ei) / 2; // speed of eating bananas
            if (checkTime(arr, mid, hours) == true) { // checking are we able to all bananas within given hours time
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return si;
    }

    public static boolean checkTime(int[] arr, int speed, int totalTime) {
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += arr[i] / speed;
            if (arr[i] % speed != 0) {
                time++;
            }
        }

        if (time <= totalTime) {
            return true;
        } else {
            return false;
        }
    }

    public static int max(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }
}