import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        System.out.print(getMazePaths(0, 0, row-1, col-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //base
        //faith
        //expectation

        if(sr==dr && sc==dc) {
            ArrayList<String>al = new ArrayList<String>();
            al.add("");
            return al;
        }

        ArrayList<String>al;
        ArrayList<String>fal = new ArrayList<String>();

        //h
        for (int i = 1; i <= dc ; i++) {
            if(sc+i<=dc)
            {
                al = getMazePaths(sr, sc+i, dr, dc);
                for (String string : al) {
                    fal.add("h"+i+string);
                }
            }
           
        }

        //v

        for (int i = 1; i <= dr ; i++) {
            if(sr+i<=dr)
            {
                al = getMazePaths(sr+i, sc, dr, dc);
                for (String string : al) {
                    fal.add("v"+i+string);
                }
            }
           
        }
        //d

        for (int i = 1; i <=dr && i <=dc ; i++) {
            if(sr+i<=dr && sc+i<=dc)
            {
                al = getMazePaths(sr+i, sc+i, dr, dc);
                for (String string : al) {
                    fal.add("d"+i+string);
                }
            }
        }

        return fal;
    }

}