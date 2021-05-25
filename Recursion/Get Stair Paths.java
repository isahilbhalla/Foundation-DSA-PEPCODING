import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        //base
        //faith
        //expect

        if(n==0)
        {
            ArrayList<String>al = new ArrayList<String>();
            al.add("");
            return al;
        }

        ArrayList<String>al;
        ArrayList<String>fal =new ArrayList<String>();

        for(int i=1;i<=3;i++)
        {
            if(n-i>=0)
            {
                 al = getStairPaths(n-i);
            for (String stri : al) {
                fal.add(i+""+stri);
            }
            }
           
        }

        return fal;
    }

}