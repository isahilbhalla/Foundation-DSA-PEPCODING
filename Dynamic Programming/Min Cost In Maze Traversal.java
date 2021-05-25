import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c  = scn.nextInt();

        int arr[][]  =new int [r][c];

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] =scn.nextInt();
            }
        }

        int dp[][]  =new int [r][c];

        dp[0][0] = arr[0][0];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 && j>0)
                {
                    dp[i][j] = dp[i][j-1]+arr[i][j];
                }
                else if(i>0 && j==0)
                {
                    dp[i][j]  = dp[i-1][j] + arr[i][j];
                }
                else if(i>0 && j>0)
                {
                    dp[i][j]  = Math.min(dp[i-1][j],dp[i][j-1])+arr[i][j];
                }
            }
        }

        System.out.print(dp[r-1][c-1]);
    }

}