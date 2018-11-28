import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String containinString = "@gmail";
        
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        List<String>nameList = new ArrayList();
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if(emailID.contains(containinString)){
                nameList.add(firstName);
            }
        }
        
        Collections.sort(nameList);
        
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
        
        scanner.close();
    }
}
