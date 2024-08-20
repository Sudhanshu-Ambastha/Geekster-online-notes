import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char ch = 'z'; // Start with 'z'
        boolean isUpperCase = false; // Flag to alternate between uppercase and lowercase

        while (ch >= 'a') {
            if (isUpperCase) {
                System.out.print(Character.toUpperCase(ch) + " ");
            } else {
                System.out.print(ch + " ");
            }
            ch--; // Decrement the character
            isUpperCase = !isUpperCase; // Toggle the flag
        }
    }
}