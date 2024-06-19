import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 26; i++) {
            if (i % 2 == 1) {
                System.out.println("" + ch + ch + ch);
            } else {
                System.out.println("" + (char) (ch + 32) + (char) (ch + 32));
            }
            ch++;
        }
    }
}
