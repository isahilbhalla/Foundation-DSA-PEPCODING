import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
                Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[] = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }


        Integer dp[] = new Integer[n+1];
        dp[n]=0;

        for(int i=n-1;i>=0;i--) //-->dp 
        {   
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <=arr[i] && i+j<dp.length; j++) { //-->jump
                if(dp[i+j]!=null)
                {
                    min = Math.min(min, dp[i+j]+1);
                }
                
            }
            
            if(min!=Integer.MAX_VALUE)
            {
                 dp[i] = min;
            }
           
        }

        System.out.println(dp[0]);

    }

}