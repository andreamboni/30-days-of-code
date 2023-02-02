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

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        Vector<String> mail_Name_Vector = new Vector<String>();

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                String[] emailSplStrings = emailID.split("@");
                if (emailSplStrings[1].equals("gmail.com") && firstName.length() <= 20) {
                    mail_Name_Vector.add(firstName);           
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Collections.sort(mail_Name_Vector);

         for (String str : mail_Name_Vector) {
             System.out.println(str);
         }

        bufferedReader.close();
    }
}

