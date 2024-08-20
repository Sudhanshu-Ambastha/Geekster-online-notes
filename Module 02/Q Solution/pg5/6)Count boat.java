import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] people = new int[N];
        for (int i = 0; i < N; i++) {
            people[i] = sc.nextInt();
        }
        int limit = sc.nextInt();

        int boats = minBoats(people, limit);
        System.out.println(boats);
    }

    public static int minBoats(int[] people, int limit) {
        Arrays.sort(people); // Sort the people by weight
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }
}