import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        //any base to decimal (any base 10 no need)
        int ans1 = 0 , ans2  = 0,p=1 , finalans;
        if(b!=10)
        {
            while(n1>0)
            {
               ans1 = ans1 +(n1%10)*p; 
               p = p*b;
               n1= n1/10;
            }

            p=1;
            while (n2>0) {
                ans2 = ans2 + (n2%10)*p;
                p=p*b;
                n2=n2/10;
            }
        }
        //sum
        finalans = ans2+ans1;

        // decimal to any base (any base 10 no need)
        String ans = "";
        if(b!=10) {
            
            while (finalans>0) {
                ans  = finalans%b + ans;
                finalans = finalans/b;
            }
        }

        return Integer.parseInt(ans);
    }
}