import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        char start = 'a';
        char end = 'z';

        for (char ch = start; ch <= end; ch += 2) {
            System.out.println(ch);
        }
    }
}