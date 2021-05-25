import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int dp[] = new int [n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--)  //---->dp
        {
            int jump = arr[i];
            for (int j = 1; j <= jump; j++) {
                if(i+j<=n)
                {
                    dp[i]+=dp[i+j];
                }
            }
        }

        System.out.print(dp[0]);
    }

}