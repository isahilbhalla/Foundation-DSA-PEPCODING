import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dp[] = new int [n+1];
        dp[0]=1;

        for (int i = 1; i <dp.length; i++) {
            if(i-1>=0)
            {
                dp[i]=dp[i]+dp[i-1];
            }
            if(i-2>=0)
            {
                dp[i]=dp[i]+dp[i-2];
            }
            if(i-3>=0)
            {
                dp[i]=dp[i]+dp[i-3];
            }
        }

        System.out.println(dp[n]);
    }

}