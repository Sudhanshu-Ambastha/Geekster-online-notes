import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

        if (marks < 33) {
            marks += 4;
            System.out.println(marks);
        } else {
            System.out.println(marks);
        }
    }
}