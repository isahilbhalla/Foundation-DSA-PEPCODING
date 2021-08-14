import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int ans =0 , p =1;
        while(n>0)
        {
        // {   System.out.println(n+"---"+ans+"----"+p+"----"+((n%10)*p));
            ans = ans + (n%10)*p;
            p=p*b;
            n=n/10;
            //  System.out.println(n+"---"+ans+"----"+p+"----"+((n%10)*p));
        }
        return ans;
    }
}