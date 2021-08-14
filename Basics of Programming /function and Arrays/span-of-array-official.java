import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        
        System.out.print(max-min);
    }

}