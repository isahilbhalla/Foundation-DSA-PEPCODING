import java.io.*;
import java.util.*;


public class Main {
    public static class Pair implements Comparable<Pair>{
        int listindex,dataindex,val;
        Pair(int listindex,int dataindex,int val) {
            this.listindex = listindex;
            this.dataindex = dataindex;
            this.val = val;
        }

        public int compareTo(Pair obj)
        {
            return this.val - obj.val;
        }
    }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.size(); i++) {
            Pair p = new Pair(i,0,lists.get(i).get(0));
            pq.add(p);
        }

        while (pq.size()>0) {
            Pair p = pq.remove();
            rv.add(p.val);
            p.dataindex+=1;

            if(p.dataindex<lists.get(p.listindex).size())
            {
                p.val = lists.get(p.listindex).get(p.dataindex);
                pq.add(p);
            }
        }

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list); 
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}


// import java.io.*;
// import java.util.*;

// public class Main {
//    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
//       ArrayList<Integer> rv = new ArrayList<>();

//       // write your code here

//       PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//       for (ArrayList al : Lists) {
//           for (int val : al) {
//               pq.add(val);
//           }
//       }

//       while (pq.size()>0)
//       {
//           rv.add(pq.remove());
//       }
//       return rv;
//    }

//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       int k = Integer.parseInt(br.readLine());
//       ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
//       for(int i = 0; i < k; i++){
//          ArrayList<Integer> list = new ArrayList<>();

//          int n = Integer.parseInt(br.readLine());
//          String[] elements = br.readLine().split(" ");
//          for(int j = 0; j < n; j++){
//             list.add(Integer.parseInt(elements[j]));
//          }

//          lists.add(list);
//       }

//       ArrayList<Integer> mlist = mergeKSortedLists(lists);
//       for(int val: mlist){
//          System.out.print(val + " ");
//       }
//       System.out.println();
//    }

// }