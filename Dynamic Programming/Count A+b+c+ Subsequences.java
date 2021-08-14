import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int dp[][] = new int[3][2];
        
        for (int i = 0;i<str.length();i++)
        {
            if(Character.compare(str.charAt(i),'a')==0)
            {
                dp[0][1]=2*dp[0][0]+1;
                dp[0][0] = dp[0][1];
                
            }
            else if(Character.compare(str.charAt(i),'b')==0)
            {
                dp[1][1] = 2*dp[1][0]+dp[0][0];
                dp[1][0] = dp[1][1];
            }
            else
            {
                dp[2][1] = 2*dp[2][0] + dp[1][0];
                dp[2][0] = dp[2][1];
            }
        }

        System.out.println(dp[2][0]);
    }
}




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        int a=0,b=0,c=0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            
            if(Character.compare(str.charAt(i),'a')==0)
            {
                a = 2*a+1;
            }
            else if (Character.compare(str.charAt(i),'b')==0)
            {
                b = 2*b+a;
            }
            else 
            {
                c = 2*c+b;
            }
        }
        
        System.out.println(c);
    
    }
}