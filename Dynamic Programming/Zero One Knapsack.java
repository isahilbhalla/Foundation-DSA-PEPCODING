import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int weight[] = new int[n];
        int val[] = new int[n];
        
        for (int i = 0; i<n;i++)
        {
            val[i] = scn.nextInt();
        }

        for(int i = 0; i<n;i++)
        {
            weight[i] = scn.nextInt();
        }

        int amt = scn.nextInt();

        int dp[][] = new int [n][amt+1];
        
        for (int i = 0; i<n;i++)
        {
            for(int w=0;w<=amt;w++)
            {
                if(i==0)
                {
                    if(w>=weight[i])
                    {
                        dp[i][w] = val[i];
                    }
                }
                else if(w>=weight[i])
                {
                    dp[i][w] = Math.max(dp[i-1][w],dp[i-1][w-weight[i]]+val[i]);
                }
                else
                {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        
        System.out.println(dp[n-1][amt]);

    }
}