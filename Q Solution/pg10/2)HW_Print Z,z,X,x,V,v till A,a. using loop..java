import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        char currentChar = 'Z';

        // Loop until we reach 'A'
        while (currentChar >= 'A') {
            // Print uppercase and lowercase characters
            System.out.print(currentChar + " " + Character.toLowerCase(currentChar) + " ");
            currentChar--; // Move to the previous character
        }
    }
}