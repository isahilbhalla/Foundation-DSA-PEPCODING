import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int ar1[] = new int[a1];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scn.nextInt();
        }

        int a2 = scn.nextInt();
        int ar2[] = new int[a2];

        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scn.nextInt();
        }

        int i=a1-1 , j=a2-1 , borrow =0 , finlans[] = new int[a2] , k= a2-1;

        while (j>=0)
        {   
            if(i<0 && j>=0)
            {
                if(ar2[j]-borrow<0)
                {
                     finlans[k] = ar2[j]+10-borrow;
                        // System.out.println(finlans[k]+"--****--"+(ar2[j]+10)+"-***--"+borrow);
                     borrow = 1;
                }
                else
                {
                    finlans[k] = ar2[j]-borrow;
                    //  System.out.println(finlans[k]+"--****--"+ar2[j]+"-***--"+borrow);
                     borrow = 0;
                }
              
                j--;
                k--;
            }
            else
            {
                  if(ar2[j]-ar1[i]-borrow<0)
            {
               
                 finlans[k] = (ar2[j]+10)-ar1[i]-borrow;
                //   System.out.println(finlans[k]+"-----------"+(ar2[j]+10)+"-----"+ar1[i]+"------"+borrow);
                 borrow=1;
            }
            else
            {
                finlans[k]= ar2[j]-ar1[i]-borrow;
                //  System.out.println(finlans[k]+"^^^^^^^^^^^"+ar2[j]+"^^^^^^^"+ar1[i]+"^^^^^^^^^"+borrow);
                borrow=0;
            }
            i--;
            j--;
            k--;
            }
          
        }

        int flag=0;

        for (int k2 = 0; k2 < finlans.length; k2++) {
            if(flag==0 && finlans[k2]!=0)
            {
                 System.out.println(finlans[k2]);
                 flag=1;
            }
            else if (flag==1)
            {
                 System.out.println(finlans[k2]);
            }
           
        }

    }

}