import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==1)
        {
            System.out.println("0");
            return;
        }
        if(n==2)
        {
            System.out.println("1");
            return;
        }
        int f=0,s=1,t;

        for (int i = 0; i < n; i++) {
            System.out.println(f);
            t=f+s;
            f=s;
            s=t;
        }

    }
}