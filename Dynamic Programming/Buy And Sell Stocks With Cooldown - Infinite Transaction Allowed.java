import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int bloano=arr[0] , smoneyo = 0 , cmoney = 0;

        for (int i=1;i<n;i++) {
            
           
           int  bloan = Math.min(bloano, arr[i]-cmoney);

           int smoney = Math.max(smoneyo, arr[i]-bloano);

           cmoney = Math.max(cmoney, smoneyo);

           bloano = bloan;

           smoneyo = smoney;
           
           

        }

        System.out.println(smoneyo);


    }

}