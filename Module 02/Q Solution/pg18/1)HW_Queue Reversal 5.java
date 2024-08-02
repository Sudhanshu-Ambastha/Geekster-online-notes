import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the queue
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        // Read N elements into the queue
        for (int i = 0; i < N; i++) {
            queue.offer(scanner.nextInt());
        }

        // Reverse the queue
        Queue<Integer> reversedQueue = reverseQueue(queue);

        // Print the reversed queue
        while (!reversedQueue.isEmpty()) {
            System.out.print(reversedQueue.poll());
            if (!reversedQueue.isEmpty()) {
                System.out.print(" ");
            }
        }
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Transfer queue elements to the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Transfer elements back to the queue in reversed order
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        return queue;
    }
}