import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        
        int c = scn.nextInt();

        int arr[][] = new int[n][c];

        for (int i = 0; i <n;i++)
        {
            for(int j = 0; j <c;j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[n][c];
        int mino = Integer.MAX_VALUE;
        int smino = mino;
        for (int i=0;i<c;i++) {
            dp[0][i] = arr[0][i];

            if(dp[0][i]<=mino)
            {
                smino = mino;
                mino = dp[0][i];
               
            }

            else if(dp[0][i]<=smino)
            {
                smino = dp[0][i];
            }

        }

        int min = Integer.MAX_VALUE , smin = min;
        for (int i = 1 ;i<n ;i++)
        {
            min = Integer.MAX_VALUE ; smin = min;
            for(int j = 0; j <c;j++)
            {
                if(dp[i-1][j]==mino)
                {
                    dp[i][j] = smino+arr[i][j]; 
                }
                else {
                    dp[i][j] = mino+arr[i][j];
                }

                if(dp[i][j]<=min)
                {
                    smin = min;
                    min = dp[i][j];
                  
                }
    
                else if(dp[i][j]<=smin)
                {
                    smin = dp[i][j];
                }
            }
            mino = min;
            smino = smin;
            
        }

        System.out.println(mino);

    }
}