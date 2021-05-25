import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r= scn.nextInt();
        int c = scn.nextInt();
        printMazePaths(0, 0, r-1, c-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //base
        //faith
        //expectation

        if(sr ==dr && sc==dc)
        {
            System.out.println(psf);
            return;
        }


        for (int i = 1; i <= dc; i++) {
            if(sc+i<=dc)
            {
                printMazePaths(sr, sc+i, dr, dc, psf+"h"+i);
            }
            else
            {
                break;
            }
        }

        for (int i = 1; i <= dr; i++) {
            if(sr+i<=dr)
            {
                printMazePaths(sr+i, sc, dr, dc, psf+"v"+i);
            }
            else
            {
                break;
            }
        }

        for (int i = 1; i <= dc && i <=dr; i++) {
            if(sr+i<=dr && sc+i<=dc)
            {
                printMazePaths(sr+i, sc+i, dr, dc, psf+"d"+i);
            }
            else{
                break;
            }
        }
    }

}