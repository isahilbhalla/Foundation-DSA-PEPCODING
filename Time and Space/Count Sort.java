import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int frequency[] = new int[max -min+1];

   for (int i = 0; i < arr.length; i++) {
       frequency[arr[i]-min]++;
   }

   for (int i = 0; i < frequency.length; i++) {
       if(i==0)
       {
           frequency[i]--;
       }
       else 
       {
           frequency[i]+=frequency[i-1];
       }
   }
   int finalans[] = new int[arr.length];
   for (int i = arr.length-1; i >= 0 ; i--) {
       int lastindex = frequency[arr[i]-min];
       finalans[lastindex] = arr[i]; 
       frequency[arr[i]-min]--; //last index decremented
   }
   int i=0;
   for(int val : finalans)
   {
       arr[i]=val;
       i++;
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}