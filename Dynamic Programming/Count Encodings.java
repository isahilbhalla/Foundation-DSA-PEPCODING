import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int dp[]  = new int[str.length()];
        dp[0] = 1;
        for(int i=1; i<str.length(); i++)
        {
            int val = Integer.parseInt(String.valueOf(str.charAt(i)));
            int dval = Integer.parseInt(str.substring(i-1,i+1));
            if(val!=0)
            {
                dp[i]=dp[i-1];
            }

            if(dval==0)
            {
                dp[i]=0;
            }
            else if (dval>=10 && dval<=26)
            {
                if(i>1)
                {
                    dp[i] += dp[i-2];
                }
                else
                {
                    dp[i]++;
                }
            }
            
        }

        System.out.println(dp[str.length()-1]);

    }

}