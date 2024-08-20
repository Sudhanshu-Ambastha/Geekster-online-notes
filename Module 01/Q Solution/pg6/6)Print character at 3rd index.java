import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        if (str.length() >= 4) {
            char ch = str.charAt(3);
            System.out.println(ch);
        } else {
            System.out.println("Small string");
        }
    }
}