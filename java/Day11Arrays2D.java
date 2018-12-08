import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void countMaxSum(int[][]arr){
        int nInRow = arr[0].length - 2;
        int nInColumn = arr[1].length - 2;
        
        int maxSum = -100, laikinas;
        for(int i = 0; i < nInColumn; i++){
            for(int j = 0; j < nInRow; j++){
                /* Calculate the hourglass sum for every hourglass */
                /* We define an hourglass in to be a subset of values with indices 
                   falling in this pattern in 's graphical representation: 
                   a b c
                     d
                   e f g
                */
                laikinas = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                       arr[i+1][j+1] +
                         arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(laikinas > maxSum){
                    maxSum = laikinas;
                }         
            }
        }
        System.out.println(maxSum);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        countMaxSum(arr);
        
        scanner.close();
    }
}
