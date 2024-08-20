import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);  
        HashMap<String, ArrayList<String>> map = new HashMap<>();  
        int t = scn.nextInt();   

        for (int i = 0; i < t; i++) {  
            String query = scn.next();  

            if (query.equals("add")) {  
                String empId = scn.next();  
                String name = scn.next();  
                String job = scn.next();  
                String dep = scn.next();  

                ArrayList<String> arr = new ArrayList<>();  
                arr.add(name);  
                arr.add(job);  
                arr.add(dep);  

                map.put(empId, arr);  
            } else if (query.equals("update")) {  
                String empId = scn.next();  
                String job = scn.next();  
                
                ArrayList<String> arr = map.get(empId); 
                    arr.set(1, job);  
                
                map.put(empId, arr);
            } else if (query.equals("delete")) {  
                String empId = scn.next();  
                map.remove(empId);  
            } else if (query.equals("show")) {  
                String empId = scn.next();  
                
                if (map.containsKey(empId)) {  
                    ArrayList<String> arr = map.get(empId);  
                    for (String s : arr) {  
                        System.out.print(s + " ");  
                    }  
                } else {  
                    System.out.print("-1");  
                }  
                System.out.println();  
            }  
        }   
    }  
}  