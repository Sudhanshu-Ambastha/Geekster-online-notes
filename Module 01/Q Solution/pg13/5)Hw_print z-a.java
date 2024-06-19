import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char ch = 'z'; // Start with 'z'

        while (ch >= 'a') {
            System.out.print(ch + " ");
            ch--; // Decrement the character
        }
    }
}