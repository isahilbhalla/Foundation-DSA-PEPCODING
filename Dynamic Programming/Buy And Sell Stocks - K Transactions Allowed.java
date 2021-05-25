import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        int dp[][] = new int [k+1][n];

        for(int i=1;i<=k;i++) {
            for(int j=1;j<n;j++) {
                int max = dp[i][j-1];
                for (int z=0;z<j;z++) {

                   max =  Math.max(max,dp[i-1][z] + arr[j] - arr[z]);

                }
             dp[i][j] = max;
            }
            
        }

        System.out.println(dp[k][n-1]);
    }

}