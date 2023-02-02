import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                int [] data = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {

            data[i]= sc.nextInt();
            
            
        }
        
        int returnedDay = data[0];
        int returnedMonth = data[1];
        int returnedYear = data[2];
        int dueDay = data[3];
        int dueMonth = data[4];
        int dueYear = data[5];
        
        if (returnedYear <= dueYear)
        {
            if (returnedYear ==dueYear)
            {
               // check month
               if (returnedMonth ==dueMonth)
               {
                   //check date
                   if (returnedDay <= dueDay)
                    {
                        System.out.println(0);
                    }
                    else if (returnedDay > dueDay)
                        System.out.println(15 * ( returnedDay-dueDay));
                    
                   
               }
               else if (returnedMonth> dueMonth)
               {
                   System.out.println(500 * ( returnedMonth-dueMonth));
                  
               }
               else{ //(returnedMonth< dueMonth)
                   System.out.println(0);
               }
               
                
            }
            else //returnedYear <dueYear
                System.out.println(0);
            
        }
        else //returnedYear > dueYear)
            System.out.println(10000);
    }
}
