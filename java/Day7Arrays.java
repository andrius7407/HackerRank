import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void perrusiuotiMasyva(int[] skaiciai){
        for(int i = 0; i < skaiciai.length; i++){
            int paskutinisIndeksas = skaiciai.length - i - 1;
            System.out.print(skaiciai[paskutinisIndeksas] + " ");   
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        scanner.close();
        
        perrusiuotiMasyva(arr);
    }
}
