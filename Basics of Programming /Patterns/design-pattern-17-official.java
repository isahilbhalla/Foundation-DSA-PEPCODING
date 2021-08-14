import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        
        int star = 1 ,space = n/2;
        
        for(int i=0;i<n;i++)
        {
            if(i<n/2)
            {
                for(int j=0;j<space;j++)
                {
                    System.out.print("	");
                }
                
                for(int j=0;j<star;j++)
                {
                    System.out.print("*	");
                }
                star++;
            }
            else if (i==n/2)
            {
                 for(int j=0;j<n;j++)
                {
                    System.out.print("*	");
                }
            }
            else
            {
                for(int j=0;j<space;j++)
                {
                    System.out.print("	");
                }
                
                 star--;
                for(int j=0;j<star;j++)
                {
                    System.out.print("*	");
                }
               
            }
            
            System.out.println();
        }
        // write ur code here

    }
}