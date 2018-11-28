import java.io.*;
import java.util.*;

public class Solution {
    
    public static boolean tikrintiArPrime(int n){
        if(n < 2){
            return false;
        }else if(n == 2 || n == 3){
            return true;
        }if(n % 2 == 0 || n % 3 == 0){
            return false;
        }
        int sqrtN = (int)Math.sqrt(n) + 1;
        for(int i = 6; i <= sqrtN; i += 6) {
            if(n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        }
        return true;   
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int numberOfInspections = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i = 0; i < numberOfInspections; i++){
            int Number = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            boolean arYra = tikrintiArPrime(Number);
            
            if(arYra == true){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
        scanner.close();
    }
}

