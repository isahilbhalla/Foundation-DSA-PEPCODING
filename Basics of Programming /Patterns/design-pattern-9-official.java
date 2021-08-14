import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn .nextInt();
        int space1 = 0 , space2 = n-2;
        
        for(int j=1;j<=n;j++)
        {
            if(j<=n/2)
            {
                for(int i=0;i<space1;i++)
            {
                 System.out.print("	");
            }
            
            
             System.out.print("*	");
             
             for(int i=0;i<space2;i++)
             {
                  System.out.print("	");
             }
             
             space2 = space2-2;
             
              System.out.print("*	");
             
             for(int i=0;i<space1;i++)
             {
                  System.out.print("	");
             }
             
             space1++;
            }
            else if (j==(n/2)+1)
            {
                for(int i=0;i<space1;i++)
            {
                 System.out.print("	");
            }
            
            
             System.out.print("*	");
             
             
             
             space2= space2 +2;
             

             
             for(int i=0;i<space1;i++)
             {
                  System.out.print("	");
             }
             
             space1--;
            }
            else
            {
                for(int i=0;i<space1;i++)
            {
                 System.out.print("	");
            }
            
            
             System.out.print("*	");
             
             for(int i=0;i<space2;i++)
             {
                  System.out.print("	");
             }
             
             space2 = space2+2;
             
              System.out.print("*	");
             
             for(int i=0;i<space1;i++)
             {
                  System.out.print("	");
             }
             
             space1--;
            }
            
            System.out.println();
        }
        // write ur code here

    }
}