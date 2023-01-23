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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        // int count = 2;
        // List<Integer> listInt = new ArrayList<Integer>();
        // int soma = 0;
        
        // for(int i = 0; i < arr.size(); i++) {
            
        //     for(int n = 0; n < count; n++) {
        //         if(n == 0) {
        //             soma = arr.get(i).get(i) +
        //                 arr.get(i).get(i + 1) + 
        //                 arr.get(i).get(i + 2);
        //         } else if(n == 1) {
        //             soma = soma + arr.get(i).get(i + 1);
        //         } else {
        //             soma = soma + arr.get(i).get(i) +
        //                 arr.get(i).get(i + 1) + 
        //                 arr.get(i).get(i + 2);
        //         }
        //     }
        //     listInt.add(soma);
        //     soma = 0;
        // }
        
        // System.out.println(listInt.toString());
        
        int sum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.size()-1; i++) 
            for (int j = 1; j < arr.size()-1; j++) {
                int tempSum = arr.get(i).get(j)+
                              arr.get(i-1).get(j-1)+
                              arr.get(i-1).get(j)+
                              arr.get(i-1).get(j+1)+
                              arr.get(i+1).get(j-1)+
                              arr.get(i+1).get(j)+
                              arr.get(i+1).get(j+1);
                if(tempSum > sum)
                    sum = tempSum;
            }
            System.out.print(sum);
        
    }
}

