import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int n2 =1 ,n1 = 1;
        
        for (int i = 2; i <=n; i++) {
            
            int ans = n1+n2*(i-1);
            n2 = n1;
            n1 = ans;
        }

        System.out.println(n1);
    }

}

