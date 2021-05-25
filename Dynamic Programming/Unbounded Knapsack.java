import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val[]  = new int[n];
        int weight[] = new int[n];
        
        for (int i = 0; i < n;i++)
        {
            val[i] = scn.nextInt();
        }

        for(int i = 0;i<n;i++) {
            weight[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int dp[] = new int[cap+1];

        for(int i=0;i<n;i++)
        {
            for (int w = 1; w <=cap;w++)
            {
                if(w>=weight[i])
                {
                    dp[w] = Math.max(dp[w],dp[w-weight[i]]+val[i]);
                }
            }
        }

        System.out.println(dp[cap]);
      
        
    }
}