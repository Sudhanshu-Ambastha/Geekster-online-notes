import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            printXY(x, y);
        }
    }

    public static void printXY(int x, int y) {
        int ans = (x * 10) + y;
        System.out.println(ans);
    }
}