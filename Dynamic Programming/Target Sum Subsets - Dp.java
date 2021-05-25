import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        boolean dp[][] = new boolean[n+1][tar+1];

        dp[0][0] = true;

        int flag =0;

        for (int i = 1; i <=n; i++)
        {
            for(int j = 0; j<=tar; j++)
            {
                if(j==0)
                {
                    dp[i][j] = true;
                }
               
                else if (j>=arr[i-1] && arr[i-1]<=tar)
                {
                    if(dp[i-1][j-arr[i-1]]==true || dp[i-1][j]==true)
                    {
                        dp[i][j] = true;
                    }
                    else
                    {
                        dp[i][j] = false;
                    }
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }

            if(dp[i][tar]==true)
            {
                flag = 1;
                break;
            } 
            

        }

        if(flag==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        
        }    


    }
}