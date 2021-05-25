import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int [n];

        for (int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
        }

        int l[] = new int [n];
        l[0] = 0;
        int min = arr[0];
        for (int i=1;i<n;i++)
        {
            l[i] = Math.max(l[i-1],arr[i]-min);
            min = Math.min(min,arr[i]);
        }

        int r[] = new int[n];
        r[n-1] = 0;
        int max = arr[n-1];
        int ans=l[n-1]+r[n-1];

        for (int i=n-2;i>=0;i--)
        {
            r[i] = Math.max(r[i+1],max-arr[i]);
            max = Math.max(max,arr[i]);
            ans = Math.max(ans,r[i]+l[i]);
        }

        System.out.println(ans);

    }

}