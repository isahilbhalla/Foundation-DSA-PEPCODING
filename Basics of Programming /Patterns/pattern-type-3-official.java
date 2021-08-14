import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int star = 1 , space = num-1;
        
        while(num>0)
        {
            for(int i=0;i<space;i++)
            {
                System.out.print("	");
            }
            space--;
            for(int i=0;i<star;i++)
            {
                System.out.print("*	");
            }
            star++;
            System.out.println();
            num--;
        }
        // write ur code here

    }
}