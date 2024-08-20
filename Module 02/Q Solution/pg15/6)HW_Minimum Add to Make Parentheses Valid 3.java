import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(valid(str));
    }
    public static int valid(String s){
        Stack<Character> st = new Stack<>();
        int close = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                st.push(c);
            }
            else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    close++;
                }
            }
        }
        return st.size() + close;
    }
}