import java.io.*;
import java.util.*;

public class Solution {
    static void spausdinti(String atskirti){
        System.out.print(atskirti);       
    }
    static void perrusiuotiStringa(String eilute){
        String[] raides = eilute.split("");
        
        String lyginiai = "", nelyginiai = "";
        for(int i = 0; i < raides.length; i++){
            if(i % 2 == 0){
                lyginiai = String.join("", lyginiai, raides[i]);
            } else{
                nelyginiai = String.join("", nelyginiai, raides[i]);              
            }
        }
        
        spausdinti(lyginiai);
        System.out.print(" ");
        
        spausdinti(nelyginiai);
        System.out.println();
       
    }    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int eiluciuSkaicius = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       
        for(int i = 0; i < eiluciuSkaicius; i++){
            String eilute = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            perrusiuotiStringa(eilute);       
        }
        scanner.close();
    }       
}
