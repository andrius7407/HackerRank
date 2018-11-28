import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
    
    public static final int FIRST_NUMBER_OF_SET = 1;

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int maxPossibleValue = findMaxPossValue(n, k);

            System.out.println(maxPossibleValue);
        }
        scanner.close();
    }
       
    public static int findMaxPossValue(int lastNumberOfSet, int givenInteger){

        int maxPossibleValue = 0;

        int a = FIRST_NUMBER_OF_SET;
        int tempValue = 0;
        for(int i = 0; i < lastNumberOfSet - 1; i++){
                       
            int b = a + 1;
            
            for(int j = 0; j < lastNumberOfSet - 1 - i; j++){   
                
                if((a & b) > tempValue && (a & b) < givenInteger){
                    tempValue = a & b;
                    }    
                b++;
            }
            a++;
            maxPossibleValue = tempValue;
        }        
        return maxPossibleValue;
    }     
}  
