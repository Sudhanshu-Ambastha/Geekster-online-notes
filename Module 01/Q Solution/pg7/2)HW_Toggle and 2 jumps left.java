import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char x = scn.next().charAt(0);

        char toggledChar;
        if (Character.isUpperCase(x)) {
            toggledChar = Character.toLowerCase(x);
        } else {
            toggledChar = Character.toUpperCase(x);
        }

        if (toggledChar == 'a' || toggledChar == 'A' || toggledChar == 'b' || toggledChar == 'B') {
            System.out.println("Sorry");
        } else if (toggledChar == 'c') {
            System.out.println("a");
        } else if (toggledChar == 'Z') {
            System.out.println("X");
        } else if (!Character.isLetter(x)) {
            System.out.println("No alphabet");
        } else {
            char resultChar = (char) (toggledChar - 2);
            System.out.println(resultChar);
        }
    }
}