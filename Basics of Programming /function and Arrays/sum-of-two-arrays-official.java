import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1[] = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int a2[] = new int[n2];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        int carry = 0,sum=0;
        int finl[] = new int [Math.max(n1, n2)+1];
        int i=a1.length-1,j=a2.length-1,k = finl.length-1;

        
        while(i>=0 && j>=0)
        {
            sum = a1[i] + a2[j]+carry;
            if(sum<10)
            {
              
                finl[k] = sum;
                k--;
                carry = 0;
            }
            else 
            {
               
                finl[k] = sum%10;
                k--;
                carry=1;
            }
            i--;
            j--;

        }

        if(i>=0)
        {
            for (int j2 = i; j2 >=0; j2--) {
                sum = a1[j2] + carry;
                if(sum<10)
                {
                    
                    finl[k] = sum;
                k--;
                    carry = 0;
                }
                else 
                {
                    
                    finl[k] = sum%10;
                k--;
                    carry=1;
                }

            }
        }

        if(j>=0)
        {
            for (int j2 = j; j2 >=0; j2--) {
                sum = a2[j2] + carry;
                if(sum<10)
                {
                  
                    finl[k] = sum;
                k--;
                    carry = 0;
                }
                else 
                {
                    
                    finl[k] = sum%10;
                k--;
                    carry=1;
                }

            }
        }
        
        if(finl[0]!=0)
        {
            System.out.println(finl[0]);
        }
        for (int k2 = 1; k2 < finl.length; k2++) {
            System.out.println(finl[k2]);
        }
    }

}