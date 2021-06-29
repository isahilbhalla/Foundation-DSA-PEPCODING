import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static int count;

  public static int dgt(Node node,int depth) {
    if(node.children.size()==0)
    {
      return depth;
    }
    int m1=0,m2=0;
    for(Node child : node.children)
    {
      int temp = dgt(child,depth+1);
      if(temp>m1)
      {
        m2=m1;
        m1=temp;
      }
      else if (temp>m2)
      {
        m2=temp;
      }

    }


    int ans=0;
    if(node.children.size()>1)
    {
        ans=m1+m2-(2*depth);
    }
    else 
    {
        ans = m1-depth;
    }

    count = Math.max(count,ans);
    return m1;
  }


  //// alternative approach 
  static int mdepth;

  public static int mdhelper(Node node) {
    int m1depth=-1,m2depth=-1;
    for(Node child : node.children)
    {
     int childdepth =  mdhelper(child);
     if(childdepth>m1depth)
     {
       m2depth=m1depth;
       m1depth=childdepth;
     }
     else if (childdepth>m2depth)
     {
       m2depth=childdepth;
     }
    }

    mdepth = Math.max(mdepth, m1depth+m2depth+2);

    m1depth+=1;
    return m1depth;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    // count=Integer.MIN_VALUE;
    // dgt(root,0);
    // System.out.println(count);

    mdepth=Integer.MIN_VALUE;
    mdhelper(root);
    System.out.println(mdepth);
  }

}