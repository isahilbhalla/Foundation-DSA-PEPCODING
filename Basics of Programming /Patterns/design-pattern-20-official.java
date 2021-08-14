import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==1)
        {
            System.out.print("*");
            return;
        }
        int sp1 = (n-3)/2 , sp2 = 1;
        
        
        for(int i=0;i<n;i++)
        {
            if(i<n/2 || i==n-1)
            {
                System.out.print("*	");
                for (int j = 0; j < n-2; j++) {
                    System.out.print("	");
                }
                System.out.print("*	");
                System.out.println();
            }
            else if (i==n/2)
            {
                System.out.print("*	");
                for (int j = 0; j < sp1; j++) {
                    System.out.print("	");
                }
                System.out.print("*	");
                for (int j = 0; j < sp1; j++) {
                    System.out.print("	");
                }
                System.out.print("*	");
                System.out.println();
                sp1--;
            }
            else
            {
                System.out.print("*	");
                for (int j = 0; j < sp1; j++) {
                    System.out.print("	");
                }
                System.out.print("*	");
                for (int j = 0; j < sp2; j++) {
                    System.out.print("	");
                }
                System.out.print("*	");
                for (int j = 0; j < sp1; j++) {
                    System.out.print("	");
                }
                System.out.print("*	");
                System.out.println();
                sp1--;
                sp2 = sp2 +2;
            }

        }
        // write ur code here

    }
}