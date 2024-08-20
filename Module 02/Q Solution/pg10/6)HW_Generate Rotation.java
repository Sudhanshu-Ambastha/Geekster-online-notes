import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        generateRotations(str);
    }

    public static void generateRotations(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str);
            str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
        }
    }
}