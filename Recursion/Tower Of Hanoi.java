import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();
        toh(n, t1id, t2id, t3id);
    }

    public static void toh(int n, int src, int dest, int helper){
        //base
        if(n==0)
        {
            return;
        }
        //expectation

        toh(n-1, src,helper,dest);
        System.out.println(n+"["+src+" -> "+dest+"]"); 
        toh(n-1, helper, dest, src);

    }

}