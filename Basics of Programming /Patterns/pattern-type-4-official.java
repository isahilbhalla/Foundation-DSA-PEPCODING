import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star=n,space=0;
        while(n>0)
        {
            for(int i=0;i<space;i++)
            {
                System.out.print("	");
            }
            space++;
            for(int i=0;i<star;i++)
            {
                System.out.print("*	");
            }
            star--;
            System.out.println();
            n--;
        }
        // write ur code here

    }
}