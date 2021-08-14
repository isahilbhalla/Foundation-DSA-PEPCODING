import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f=0,s=1,t;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(f+"	");
                t=f+s;
                f=s;
                s=t;
            }
            System.out.println();
        }
        // write ur code here

    }
}