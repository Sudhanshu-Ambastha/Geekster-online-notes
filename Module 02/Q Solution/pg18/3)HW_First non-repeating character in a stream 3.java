import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input stream
        String stream = scanner.next();

        String result = findFirstNonRepeating(stream);
        System.out.println(result);
    }

    public static String findFirstNonRepeating(String stream) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : stream.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            queue.offer(ch);

            while (!queue.isEmpty() && frequencyMap.get(queue.peek()) > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                result.append('#');
            } else {
                result.append(queue.peek());
            }
        }

        return result.toString();
    }
}