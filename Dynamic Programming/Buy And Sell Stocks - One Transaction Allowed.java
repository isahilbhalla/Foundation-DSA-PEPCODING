import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

       int max = arr[n-1] , ans=0;

        for (int i = n-2; i >=0; i--) {
            ans = Math.max(ans,max-arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println(ans);
    }

}