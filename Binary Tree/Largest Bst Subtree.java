import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  public static class pairlbst
  {
      boolean isbst;
      int min;
      int max;
      int noofnodes;
        pairlbst()
        {
            
        }
      pairlbst(boolean isbst,int min , int max,int noofnodes)
      {
            this.isbst = isbst;
            this.min = min;
            this.max = max;
            this.noofnodes = noofnodes;
      }
  }
  static Node ansnode;
  static int ansnonode;
  public static pairlbst lbst(Node node)
  {
      if(node==null)
      {
          return new pairlbst(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
      }

      pairlbst l = lbst(node.left);
      pairlbst r = lbst(node.right);
      pairlbst ans = new pairlbst();
      ans.isbst = l.isbst== true && r.isbst== true && node.data>=l.max && node.data<=r.min;
      ans.min = Math.min(Math.min(l.min, r.min),node.data);
      ans.max = Math.max(Math.max(r.max, l.max), node.data);
      ans.noofnodes = l.noofnodes+r.noofnodes+1;
      if(ans.isbst)
      {
          if(l.noofnodes+r.noofnodes+1 > ansnonode)
          {
            ansnode = node;
            ansnonode = l.noofnodes+r.noofnodes+1;
          }
         
          return ans;
      }
      return ans;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
    // write your code here
    lbst(root);
    System.out.println(ansnode.data+"@"+ansnonode);
  }

}