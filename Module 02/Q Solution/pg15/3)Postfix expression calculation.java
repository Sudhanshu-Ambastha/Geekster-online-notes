import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        String str = scanner.nextLine();  
        System.out.println(postfixCalculate(str));   
    }   

    private static int postfixCalculate(String str) {   
        Stack<Integer> st = new Stack<>();   
        
        for (int i = 0; i < str.length(); i++) {   
            char curr = str.charAt(i);  
            
            if (Character.isDigit(curr)) {  
                st.push(curr - '0');   
            } else {    
                int top1 = st.peek(); 
                st.pop();
                int top2 = st.peek();   
                st.pop();
                int ans = 0;   
                if (curr == '+') {  
                    ans = top2 + top1;  
                } else if (curr == '-') {  
                    ans = top2 - top1;  
                } else if (curr == '*') {  
                    ans = top2 * top1;  
                } else if (curr == '/') {  
                    ans = top2 / top1;  
                }  
                
                st.push(ans);   
            }   
        }     
        return st.peek();  
    }   
}  