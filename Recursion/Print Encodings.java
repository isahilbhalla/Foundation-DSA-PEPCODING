import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(str,"");
    }

    static String strarr[]={"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q ","r", "s", "t", "u", "v", "w", "x", "y", "z"};


    public static void printEncodings(String str,String ans) {
        //base
        //faith
        //expect   
        
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        int index = Integer.parseInt(String.valueOf(str.charAt(0))) ;
        if(index==0)
        {
            return;
        }
        String strpart = strarr[index-1];
        //single
        printEncodings(str.substring(1), ans+strpart);

        //double

        if(str.length()>1)
        {
            int dindex = Integer.parseInt(str.substring(0,2));
            if(dindex<=26)
            {
                  String dstrpart = strarr[dindex-1];

            printEncodings(str.substring(2), ans+dstrpart);
            }
          
        }
        
        



    }

}