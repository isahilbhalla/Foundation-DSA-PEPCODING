// import java.io.*;
// import java.util.*;

// public class Main {
//    static class Edge {
//       int src;
//       int nbr;
//       int wt;

//       Edge(int src, int nbr, int wt) {
//          this.src = src;
//          this.nbr = nbr;
//          this.wt = wt;
//       }
//    }
//    static int v[];

//    public static ArrayList<Integer> path(ArrayList<Edge>graph[] ,int src)
//    {
//        ArrayList<Integer> al = new ArrayList<>();
//        v[src]=1;
//        for(Edge edge:graph[src])
//        {
//            if(v[edge.nbr]==0)
//            {
//             al= path(graph,edge.nbr);
//            }
//        }
//        ArrayList<Integer>ans = new ArrayList<>();
//        ans.add(src);

//        for (Integer val : al) {
//            ans.add(val);
//        }
//        return ans;
//    } 
//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//       int vtces = Integer.parseInt(br.readLine());
//       ArrayList<Edge>[] graph = new ArrayList[vtces];
//       for (int i = 0; i < vtces; i++) {
//          graph[i] = new ArrayList<>();
//       }

//       int edges = Integer.parseInt(br.readLine());
//       for (int i = 0; i < edges; i++) {
//          String[] parts = br.readLine().split(" ");
//          int v1 = Integer.parseInt(parts[0]);
//          int v2 = Integer.parseInt(parts[1]);
//          int wt = Integer.parseInt(parts[2]);
//          graph[v1].add(new Edge(v1, v2, wt));
//          graph[v2].add(new Edge(v2, v1, wt));
//       }

//       ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      
//       // write your code here
//       v= new int[vtces];
//       for (int i = 0; i<vtces; i++) {
//           if(v[i]==0)
//           {
//                 comps.add(path(graph,i));
//           }

//       }

//       System.out.println(comps);
//    }
// }



import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void path(ArrayList<Edge> graph[], int src,boolean visited[],ArrayList<Integer>al) {
       visited[src] = true;
       al.add(src);
       for(Edge edge : graph[src])
       {
           if(visited[edge.nbr]==false)
           {
               path(graph,edge.nbr, visited, al);
           }
       }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      boolean visited[] = new boolean[vtces];
      // write your code here
      for (int i = 0; i < vtces; i++)
      {
          if(visited[i]==false)
          {
              ArrayList<Integer>al = new ArrayList<>();
              path(graph,i,visited,al);
              comps.add(al);
          }
      }

      System.out.println(comps);
   }
}