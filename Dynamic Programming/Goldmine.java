import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r;i++) {
            for (int j = 0;j < c;j++) {
                arr[i][j] = scn.nextInt();

            }
        }

        int dp[][] = new int[r][c];


        for (int i=0;i<r;i++) {
            dp[i][0] = arr[i][0];
        }

     for (int i = 1;i<c;i++)
        {
            for (int j=0;j < r;j++)
            {
                if(j==0)
                {
                    dp[j][i] = Math.max(dp[j][i-1],dp[j+1][i-1]) + arr[j][i];
                }
                
                
                else if (j==r-1)
                {
                    dp[j][i] = Math.max(dp[j][i-1],dp[j-1][i-1]) + arr[j][i];
                }

            
                else {
                    dp[j][i] = Math.max(dp[j][i-1],Math.max(dp[j+1][i-1],dp[j-1][i-1])) + arr[j][i];
                }
            }
        }
        int maxval = Integer.MIN_VALUE;

        for (int i = 0;i<r;i++)
        {
            //  System.out.println(dp[i][c-1]+"-----");
            maxval = Math.max(maxval,dp[i][c-1]);
        }

        System.out.println(maxval);
    }

}