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
        int n = scanner.nextInt();
        int countOfMultiples = 10;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 0; i < countOfMultiples; i++){
            System.out.println(n + " x " + (i + 1) + " = " + (n * (i + 1)));
        }
        scanner.close();
    }
}
