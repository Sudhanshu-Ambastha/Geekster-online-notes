import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        final int NUM_ITERATIONS = 26;
        char currentChar = 'a';

        for (int iteration = 0; iteration < NUM_ITERATIONS; iteration++) {
            if (iteration % 2 == 0) {
                System.out.println(Character.toLowerCase(currentChar));
            } else {
                System.out.println(Character.toUpperCase(currentChar));
            }
            currentChar++;
        }
    }
}