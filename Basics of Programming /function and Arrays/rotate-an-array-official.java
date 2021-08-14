import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
     //actual rotation
    k = k%a.length;
    //positive rotation
    if (k<0) {
        k = k + a.length;
    }
    //full rotation
    rot(a,0,a.length-1);
    //partition rotation
    rot(a,0,k-1);
    //partition rotation
    rot(a,k,a.length-1);
  }
  
   public static void rot(int a[],int start,int end)
  {
      int endpt = (start+end)/2;
      int startpt = start;

      for (int i = startpt; i <= endpt; i++) {
          int temp = a[i];
          a[i] = a[end];
          a[end] = temp;
          end--;
      }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}