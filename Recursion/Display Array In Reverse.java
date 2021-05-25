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
        displayArrReverse(arr,n-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==0)
        {
            System.out.println(arr[idx]);
            return;
        }
        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);
    }

}