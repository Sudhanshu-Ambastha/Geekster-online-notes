import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        long K = input.nextLong();

        while (N >= 0) {
            System.out.println(N);
            N -= K;
        }
    }
}
