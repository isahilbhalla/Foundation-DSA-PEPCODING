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

        int fee = scn.nextInt();

        int bloano = arr[0] , smoney = 0;

        for (int i = 1; i < n; i++) {
         int   bloan = Math.min(bloano,arr[i]-smoney);
            smoney = Math.max(smoney,arr[i]-fee-bloano);

            bloano = bloan;
        }

        System.out.println(smoney);
    }

}