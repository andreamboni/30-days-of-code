import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }
    
    void computeDifference() {
        int elementsLength = this.elements.length;
        int tempMaximumDifference = 0;
        for(int i = 0; i < elementsLength; i++) {
            for(int a = 0; a < elementsLength; a++) {
                tempMaximumDifference = elements[elementsLength - (a + 1)] - elements[i];
                // System.out.println("tempMaximumDifference " + elements[elementsLength - 1] + " - " + elements[a] + " = " + tempMaximumDifference);
                if(tempMaximumDifference > this.maximumDifference) {
                    maximumDifference = tempMaximumDifference;
                }
            }
            elementsLength = this.elements.length;
            // System.out.println("elementsLength " + elementsLength);
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
