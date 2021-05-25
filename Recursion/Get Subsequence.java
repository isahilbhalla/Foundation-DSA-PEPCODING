import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        System.out.print(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        //base
        //faith
        //expect

        if(str.length()==0)
        {
             ArrayList<String>ans = new ArrayList<String>();
             ans.add("");
             return ans;
        }

        ArrayList<String>ans;
        ArrayList<String>fans=new ArrayList<String>();
        ans = gss(str.substring(1));

        

        //not included

        for (String str1 : ans) {
            fans.add(str1);
        }

        //included

        for (String str2 : ans) {
            fans.add(str.charAt(0)+str2);
        }

        return fans;
    }

}