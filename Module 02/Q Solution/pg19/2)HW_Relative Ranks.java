import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = s.nextInt();
        }

        String[] ranks = ranks(scores);

        for (String rank : ranks) {
            System.out.print(rank + " ");
        }
    }
    public static String[] ranks(int[] scores) {
        int n = scores.length;
        String result[] = new String[n];
        
        PriorityQueue<int[]> max = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        
            for(int i = 0; i < n; i++){
                max.add(new int[]{scores[i], i});
            }
            
            //assign ranks
            for(int i = 0; i < n; i++){
                int score[] = max.poll();
                int index = score[1];
                if(i == 0){
                    result[index] = "Gold Medal";
                }else if(i == 1){
                    result[index] = "Silver Medal";
                }else if(i == 2){
                    result[index] = "Bronze Medal";
                }else{
                    result[index] = String.valueOf(i + 1);
                } 
            }
            return result;
        }
    }