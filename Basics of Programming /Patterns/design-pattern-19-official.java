import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp1 = n/2 , sp2 = n/2-1;
        
        for(int i = 0;i<n;i++)
        {
            if(i==0)
            {
                for(int j=0;j<n/2+1;j++)
                {
                    System.out.print("*	");
                }

                for(int j=0;j<sp2;j++)
                {
                    System.out.print("	");
                }

                System.out.print("*	");
                System.out.println();

            }
            else if(i<n/2)
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

                System.out.print("*	");
                System.out.println();
            }
            else if(i==n/2)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*	");
                }
                System.out.println();

            }
            else if(i==n-1)
            {
                System.out.print("*	");

                for(int j=0;j<sp2;j++)
                {
                    System.out.print("	");
                }
                for(int j=0;j<n/2+1;j++)
                {
                    System.out.print("*	");
                }

               

                
                System.out.println();
            }
            else if(i>n/2)
            {
                System.out.print("*	");

                for(int j=0;j<sp2;j++)
                {
                    System.out.print("	");
                }
                System.out.print("*	");
                System.out.println();
            }
        }
        
        // write ur code here

    }
}