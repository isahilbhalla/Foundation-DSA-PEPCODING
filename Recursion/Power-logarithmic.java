import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.print(power(x, n));
    }

    public static int power(int x, int n){
        //base

       if (n==0) {
           return 1;
       }

        //expectation
        int ans = power(x, n/2);
        //faith
        if (n%2==0) {
            return ans*ans;
        }
        else
        {
            return ans*ans*x;
        }
    }

}