import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void paverstiNDvejetainiu(int n){
        int liekana = 0, skaiciuojam = 0, vienetai = 0;
        while(n > 0){
            liekana = n % 2;
            n = n / 2;
            if(liekana == 1){
                skaiciuojam++;
                if(skaiciuojam >= vienetai){
                    vienetai = skaiciuojam;
                }
            }else{
                skaiciuojam = 0;
            }           
        }  
        System.out.println(vienetai);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        paverstiNDvejetainiu(n);
        scanner.close();
    }
}
