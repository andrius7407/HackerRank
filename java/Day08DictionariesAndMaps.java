//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    static Map<String, String> telefonuKnyga = new HashMap<String, String>();
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String []args){
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            String phoneString = Integer.toString(phone);
            // Write code here
            telefonuKnyga.put(name, phoneString);
        }
        rastiAtitikimus();
       
        in.close();
    }
    
    static void rastiAtitikimus(){
         while(in.hasNext()){
            String vardas = in.next();
            // Write code here
            String numeris = telefonuKnyga.get(vardas);
            if(numeris != null){
                System.out.println(vardas + "=" + numeris);
            }else{
                System.out.println("Not found");
            }
        }
    }
}
