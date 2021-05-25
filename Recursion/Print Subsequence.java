import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str,"");
    }

    public static void printSS(String str, String ans) {
        //base
        //faith 
        //expectation

        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        printSS(str.substring(1),ans+str.charAt(0));

        printSS(str.substring(1), ans);

    }

}