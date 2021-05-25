import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];

        for (int i = 0; i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        int amt  = scn.nextInt();

        int dp[] = new int [amt+1];
        dp[0] =1;
        for (int i=0;i<n;i++)
        {
            for (int j =1;j<=amt;j++)
            {
                if(j>=arr[i])
                {
                    dp[j]+= dp[j-arr[i]];
                }
            }
        }
        System.out.println(dp[amt]);

    }
}