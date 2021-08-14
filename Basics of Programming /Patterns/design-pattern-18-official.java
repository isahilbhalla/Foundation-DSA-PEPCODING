import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int sp1 = 1 , sp2 = n-4,star=3;
        
        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*	");
                   
                }
                 System.out.println();
            }
            else if (i<n/2)
            {
                for(int j=0;j<sp1;j++)
                {
                     System.out.print("	");
                }
                
                 System.out.print("*	");
                 
                 for(int j=0;j<sp2;j++)
                {
                     System.out.print("	");
                }
                sp2=sp2-2;
                  System.out.print("*	");
                  sp1++;
                    System.out.println();
            }
            else if(i==n/2)
            {
                 for(int j=0;j<sp1;j++)
                {
                     System.out.print("	");
                }
                sp1--;
                System.out.println("*	");
            }
            else if (i>n/2)
            {
                 for(int j=0;j<sp1;j++)
                {
                     System.out.print("	");
                }
                sp1--;
                
                for(int j=0;j<star;j++)
                {
                    System.out.print("*	");
                }
                
                star = star+2;
                System.out.println();
            }
        }
        // write ur code here

    }
}