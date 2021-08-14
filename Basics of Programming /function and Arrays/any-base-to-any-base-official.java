import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int ans =0;

        //source base to decimal base (source 10 toh no need)
        if(sourceBase!=10)
        {   int p = 1;
            while(n>0)
            {
                ans = ans+(n%10)*p;
                p=p*sourceBase;
                n=n/10;
            }
        }
       

        //decimal base to dest base(if dest is 10 no need)
        String finalans = "";
        if (destBase!=10) {
            
            while (ans>0) {
                finalans  = ans%destBase + finalans;
                ans = ans / destBase;
            }
        }
        System.out.println(Integer.parseInt(finalans));
        
    }
}