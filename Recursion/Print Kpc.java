import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str,"");

    }
    static String strarr[]={ ".;",
    "abc",
    "def",
    "ghi",
    "jkl",
    "mno",
    "pqrs",
    "tu",
    "vwx",
    "yz"};
    public static void printKPC(String str, String asf) {
        //base
        //faith
        //expectation

        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }

        int index = Integer.parseInt(String.valueOf(str.charAt(0)));
        String strpart = strarr[index];
        while (strpart.length()!=0) {
            printKPC(str.substring(1), asf+strpart.charAt(0));

            // printKPC(str.substring(1), asf);

            strpart = strpart.substring(1);
        }

    }

}