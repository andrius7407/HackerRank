import java.io.*;
import java.util.*;

public class Solution {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        final int YEARLY_FINE = 10000;
        final int MONTHLY_FINE = 500;
        final int DAYLY_FINE = 15;
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String returned = scanner.nextLine();
        String expected = scanner.nextLine();
        
        String []returnedDate = returned.split("\\s+");
        String []expectedDate = expected.split("\\s+");
        
        int returnedDay = Integer.parseInt(returnedDate[0]);
        int returnedMonth = Integer.parseInt(returnedDate[1]);
        int returnedYear = Integer.parseInt(returnedDate[2]);
        
        int expectedDay = Integer.parseInt(expectedDate[0]);
        int expectedMonth = Integer.parseInt(expectedDate[1]);
        int expectedYear = Integer.parseInt(expectedDate[2]);
        
        int fine = 0;
        
        if(returnedYear > expectedYear){
            fine = YEARLY_FINE;
        }else if(returnedYear < expectedYear){
            fine = 0;
        } else{
            if(returnedYear == expectedYear){
                if(returnedMonth > expectedMonth){
                    fine = MONTHLY_FINE * (returnedMonth - expectedMonth);
                }else if(returnedMonth < expectedMonth){
                    fine = 0;
                }else{
                    if(returnedDay > expectedDay){
                        fine = DAYLY_FINE * (returnedDay - expectedDay);
                    }else{
                        fine = 0;
                    }
                }
            }           
        }
        System.out.println(fine);
    }
}
