import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(bufferedReader.readLine().trim());
        String[] array = new String[number];
        

        if(number >= 1 && number <= 10) {
            
            for(int a = 0; a < number; a++) {
                String string = bufferedReader.readLine().trim();
                array[a] = string;
            }
        
        }
            
        for(int i = 0; i < array.length; i++) {
            
            String even = "";
            String odd = "";
                  
            for(int b = 0; b < array[i].length(); b++) {
         
                if(b % 2 == 0) {
         
                    even += array[i].charAt(b);
         
                } else {
         
                    odd += array[i].charAt(b);
         
                }
         
            }
            
            System.out.println(even + " " + odd);
            
        }      
        
    }
}
