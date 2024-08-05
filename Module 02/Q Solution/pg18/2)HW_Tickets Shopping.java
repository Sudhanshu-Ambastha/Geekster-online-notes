import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tickets = new int[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        int timeTaken = processQueue(tickets, k);
        System.out.println(timeTaken);
    }

    static int processQueue(int[] tickets, int k) {
        int n = tickets.length;
        int time = 0;

        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (tickets[i] > 0) {
                    time++;
                    tickets[i]--;
                }
                if (i == k && tickets[k] == 0) {
                    return time;
                }
            }
        }
        return time;
    }
}
