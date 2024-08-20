import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String target = scanner.nextLine();

        if (str.length() != target.length()) {
            System.out.println("False");
        } else {
            String doubleStr = str + str;
            if (doubleStr.contains(target)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        scanner.close();
    }
}