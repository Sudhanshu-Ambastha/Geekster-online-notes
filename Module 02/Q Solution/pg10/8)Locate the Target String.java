
//1st way
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String target = scanner.nextLine();

        int index = str.indexOf(target);
        System.out.println(index != -1 ? index : -1);
    }
}

// 2nd way
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String target = scn.nextLine();

        System.out.println(locateTarget(str, target));
    }

    public static int locateTarget(String str, String target) {
        for (int i = 0; i <= str.length() - target.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(j) != str.charAt(i + j)) {
                    break;
                }
                if (j == target.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}