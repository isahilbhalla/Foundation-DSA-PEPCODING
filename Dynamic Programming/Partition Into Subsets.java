import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here
        long dp[][] = new long [k+1][n+1];

        for (int p = 1; p < dp.length; p++) {
            for (int np = 1; np < dp[0].length; np++) {
                if(p==1 || np==p)
                {
                    dp[p][np] = 1;
                }
                else if(np<p)
                {
                    dp[p][np] = 0;
                }
                else {
                    dp[p][np] = dp[p-1][np-1] +dp[p][np-1]*p;
                }
            }
        }

        return dp[k][n];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}