import java.io.*;
import java.util.*;

public class Solution {

        public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if (num <= 1 || num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num ; i+=6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++) {

            int n = in.nextInt();
            System.out.println(isPrime(n)?"Prime":"Not prime");
        }
    }
}

