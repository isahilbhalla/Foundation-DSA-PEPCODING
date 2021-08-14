import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int space = 0;
        while(n>0)
        {
            for(int i=0;i<space;i++)
            {
                System.out.print("	");
            }
            System.out.print("*");
            System.out.println();
            space++;
            n--;
        }
        // write ur code here

    }
}