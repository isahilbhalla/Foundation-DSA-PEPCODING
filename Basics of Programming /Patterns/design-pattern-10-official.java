import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int space1 = n/2 , space2 = 1;
        
        for(int j=0;j<n;j++)
        {
            if(j==0)
            {
                for(int i=0;i<space1;i++)
                {
                    System.out.print("	");
                }
                
                space1--;
                System.out.print("*	");
            }
            else if(j<=n/2)
            {
                  for(int i=0;i<space1;i++)
                {
                    System.out.print("	");
                }
                
                space1--;
                System.out.print("*	");
                
                 for(int i=0;i<space2;i++)
                {
                    System.out.print("	");
                }
                
                space2  = space2 +2;
                
                System.out.print("*	");
            }
            else if (j==n-1)
            {   
                space1++;
                 for(int i=0;i<space1;i++)
                {
                    System.out.print("	");
                }
                
                
                System.out.print("*	");
            }
            else
            {
                 space1++;
                 for(int i=0;i<space1;i++)
                {
                    System.out.print("	");
                }
                
               
                System.out.print("*	");
                
                space2  = space2 -2;
                 for(int i=0;i<space2;i++)
                {
                    System.out.print("	");
                }
                
                
                
                System.out.print("*	");
            }
            
              if(j==n/2)
            {
                space1++;
                space2 = space2 -2;
            }
            
            System.out.println();
        }
        // write ur code here

    }
}