import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int [n];

        for (int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        int buy = arr[0] , sell = arr[0] , ans =0 ;

        for (int i=1;i<n;i++) {
            if(arr[i]>sell) 
            {
                sell = arr[i];
            }
            else if(arr[i]<sell) {
                ans+=sell-buy;
                sell = arr[i];
                buy = arr[i];
            }
        }
        System.out.println(ans+(sell-buy));
    }

}