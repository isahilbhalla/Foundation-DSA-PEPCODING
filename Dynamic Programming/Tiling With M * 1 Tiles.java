import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int w = scn.nextInt();

        int dp[] = new int [n+1];
        
        for (int i = 0; i < dp.length; i++) {
            if (i<w) {
                dp[i] = 1;
            }
            else {
                dp[i] = dp[i-1] + dp[i-w];
            }
        }

        System.out.println(dp[n]);
    }
}