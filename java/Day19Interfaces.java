import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}


class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int suma = 0;
        int daliklis = n;
        
        while(daliklis > 0){
            if(n % daliklis == 0){
                suma += n / daliklis; 
            }
            daliklis--;
        }
        return suma;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
