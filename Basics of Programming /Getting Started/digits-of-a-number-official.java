import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int n1 = n;
        // count length
        int count = 0;
        while(n1>0)
        {
            n1 = n1/10;
            count++;
        }
        int totallength = count;
        // System.out.println(count+"---"+totallength);
        count--;
        // power
        int p=1;
        while(count>0)
        {
            p = p * 10;
            count--;
        } 
        //  System.out.println(count+"---"+totallength+"-------"+p);
        //print
        System.out.println(n/p);

        while (totallength>1) {
            p=p/10;
            System.out.println((n/p)%10);
            totallength--;

        }



    }
}