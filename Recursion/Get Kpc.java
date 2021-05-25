import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(getKPC(str));
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
    public static ArrayList<String> getKPC(String str) {
        //base
        //faith
        //belive
        if(str.length()==0)
        {
            ArrayList<String> al = new ArrayList<String>();
            al.add("");
            return al;
        }
        int index = Integer.parseInt(String.valueOf(str.charAt(0)));

        String stpart = strarr[index];
        ArrayList<String>al;
        ArrayList<String>fal = new ArrayList<String>();

        al = getKPC(str.substring(1));
        while (stpart.length()!=0) {
            char ch = stpart.charAt(0);
            for (String string : al) {
                fal.add(ch+string);
            }
            stpart = stpart.substring(1);

        }

        return fal;



    }

}