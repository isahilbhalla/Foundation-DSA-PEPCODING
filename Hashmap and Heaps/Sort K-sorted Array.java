import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here

      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

      for (int i = 0; i < k ; i++) {
          pq.add(arr[i]);
      }
      for (int i = k; i < arr.length; i++) {
          if(pq.peek()<arr[i])
          {
              System.out.println(pq.remove());
              pq.add(arr[i]);
          }
          else {
              System.out.println(arr[i]);
          }
      }

      while (pq.size()>0) {
        System.out.println(pq.remove());
    }
   }

}