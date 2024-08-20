import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int x = scanner.nextInt();

        System.out.print("");
        int y = scanner.nextInt();

        System.out.print("");
        int z = scanner.nextInt();

        int finalZ = calculateZ(x, y, z);
        System.out.println("" + finalZ);
    }

    public static int calculateZ(int x, int y, int z) {
        if (x >= 20) {
            if (y >= 100) {
                z += 100;
            } else if (y >= 50) {
                z += 50;
            } else {
                z += 10;
            }
        } else {
            if (y >= 100) {
                z += 3;
            } else if (y >= 50) {
                z += 2;
            } else {
                z += 1;
            }
        }
        return z;
    }
}