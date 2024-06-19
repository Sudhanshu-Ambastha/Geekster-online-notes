import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        int breadth = scn.nextInt();

        int area = length * breadth;
        int parameter = 2 * (length + breadth);

        System.out.println(area);
        System.out.println(parameter);
    }
}