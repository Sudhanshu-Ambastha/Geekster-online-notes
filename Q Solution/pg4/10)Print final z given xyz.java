import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        if (x >= 20 && z < 100) {
            z = (z + 200);
        } else if (x >= 10 || y < 50) {
            z = (z + 100);
        }
        System.out.println(z);
    }
}