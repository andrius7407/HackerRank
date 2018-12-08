import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void convert(String raw){
        
        try{
            int stringInt = Integer.parseInt(raw);
            System.out.println(stringInt);
        }catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convert(S);
        in.close();
    }
}
