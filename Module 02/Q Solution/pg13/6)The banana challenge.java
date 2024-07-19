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
}  