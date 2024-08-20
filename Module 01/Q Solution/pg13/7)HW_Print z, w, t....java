import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char letter = 'z'; // Start with 'z'

        while (letter >= 'd') {
            System.out.print(letter + " ");
            letter -= 3; // Decrement the letter
        }
    }
}