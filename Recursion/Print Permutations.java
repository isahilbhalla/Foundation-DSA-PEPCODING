import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str,String ans) {
       //base
       //faith
       //expectations

        if (str.length()==0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if(i==0)
            {
               
                printPermutations(str.substring(i+1), ans+str.charAt(i));
               
            }
            else
            {
               
                printPermutations(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
              
            }


           
        }

    }

}