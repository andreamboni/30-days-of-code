import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        StringBuilder binary = new StringBuilder();
        
        while(n > 0) {
           binary.append(n % 2);
           n = n / 2;
        }
        
        String[] arr = binary.toString().split("0");
        int oneQuant = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > 1 && arr[i].length() > oneQuant) {
               oneQuant = arr[i].length();
            }
        }
   
        if(oneQuant == 0 && arr.toString().contains("1")) {
            oneQuant = 1;
        }
        
        System.out.println(oneQuant);

        bufferedReader.close();
    }
}

