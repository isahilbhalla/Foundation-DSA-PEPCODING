import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

       for (int i = 0; i < a.length; i++) {
            int k=i;
            while(k<a.length)
            {
                for (int j = i; j <=k; j++) {
                    System.out.print(a[j]+"	");
                }
                k++;
                System.out.println();
            }

            
            
        }
    }

}