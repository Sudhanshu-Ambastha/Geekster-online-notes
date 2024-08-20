import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] marks = new int[N];
        for (int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println(findLastRemainingNumber(N, marks));
    }

    public static int findLastRemainingNumber(int N, int[] marks) {
        Arrays.sort(marks);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int mark : marks) {
            deque.add(mark);
        }
        boolean firstTeacherTurn = true;

        while (deque.size() > 1) {
            if (firstTeacherTurn) {
                deque.pollFirst();
            } else {
                deque.pollLast();
            }
            firstTeacherTurn = !firstTeacherTurn;
        }

        return deque.poll();
    }
}