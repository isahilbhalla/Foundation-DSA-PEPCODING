import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        System.out.println(getMazePaths(0,0,row-1,col-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //base
        // faith
        //expectation

        if(sr==dr && sc==dc) {
            ArrayList<String>al = new ArrayList<String>();
            al.add("");
            return al;
        }

        ArrayList<String>al;
        ArrayList<String>fal = new ArrayList<String>();
        //h
          if(sc+1<=dc)
        {
            al = getMazePaths(sr, sc+1, dr, dc);
            for (String string : al) {
                fal.add("h"+string);
            }
        }
        if(sr+1<=dr)
        {
            al = getMazePaths(sr+1, sc, dr, dc);
            for (String string : al) {
                fal.add("v"+string);
            }
        }
        //v

      

        return fal;
    }

}