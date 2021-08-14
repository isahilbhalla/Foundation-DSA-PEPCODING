import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    if(n==1)
    {
        System.out.print("1");
        return ;
    }
    int star = 1 , sp  = 2*n-3;

    for (int i = 1; i <= n; i++) {
        
        for (int j = 1; j <= i; j++) {
            System.out.print(j+"	");
        }

        for (int j = 0; j < sp; j++) {
            System.out.print("	");
        }
        if(i<n)
        {
             for (int j = i; j >0; j--) {
            System.out.print(j+"	");
             }
        }
        else
        {
             for (int j = i-1; j >0; j--) {
            System.out.print(j+"	");
        }
       
        }
        System.out.println();
        star++;
        sp = sp-2;
    }
     // write ur code here

 }
}