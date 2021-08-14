import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int num = scn.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                System.out.print(i);
                return;
            }
        }
        
         System.out.print("-1");

    }

}