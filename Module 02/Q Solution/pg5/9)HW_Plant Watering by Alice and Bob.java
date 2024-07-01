import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] plants = new int[n];
        for (int i = 0; i < n; i++) {
            plants[i] = scn.nextInt();
        }
        int capacityA = scn.nextInt();
        int capacityB = scn.nextInt();
        System.out.println(minRefills(plants, capacityA, capacityB));
    }

    public static int minRefills(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int refills = 0;
        int aliceWater = capacityA;
        int bobWater = capacityB;

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (aliceWater < plants[i]) {
                aliceWater = capacityA;
                refills++;
            }
            aliceWater -= plants[i];
            i++;

            if (i <= j) {
                if (bobWater < plants[j]) {
                    bobWater = capacityB;
                    refills++;
                }
                bobWater -= plants[j];
                j--;
            }

            if (i <= j && i == j) {
                if (aliceWater >= bobWater) {
                    if (aliceWater < plants[i]) {
                        aliceWater = capacityA;
                        refills++;
                    }
                    aliceWater -= plants[i];
                } else {
                    if (bobWater < plants[j]) {
                        bobWater = capacityB;
                        refills++;
                    }
                    bobWater -= plants[j];
                }
                i++;
                j--;
            }
        }

        return refills;
    }
}