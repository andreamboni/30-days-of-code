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



public class DayThree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        boolean isEven = N % 2 == 0;
        boolean isOdd = N % 2 == 1;

        bufferedReader.close();

        // When odd = Weird
        // When even = Not Weird        
        if(N >= 1 && N <= 100) {
            
            if (N >= 6 && N <= 20 && isEven) {
                System.out.println("Weird");
            } else if(isOdd) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
            
        }
    
    }
}

