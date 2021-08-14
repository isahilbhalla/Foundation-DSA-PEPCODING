import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst=1;
        for(int i=0;i<n;i++)
        {
            int icjp = 1; 
            for(int j=1;j<=nst;j++)
            {   
                System.out.print(icjp+"	");
                    int icj = icjp*(i-j+1)/j;
                icjp=icj;
               
                
                
            }
            nst++;
            System.out.println();
        }
        //write your code here

    }
}