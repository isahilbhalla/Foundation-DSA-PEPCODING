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
  public static class stPair{
      Node node;
      int state;

      stPair(Node node,int state)
      {
          this.node = node;
          this.state = state;
      }
  }

  public static Node leftin(Stack<stPair>stleft)
  {
      while (stleft.size() > 0) {
          stPair current = stleft.peek();
          if(current.state==0)
          {
                if(current.node.left!=null)
                {
                    stleft.add(new stPair(current.node.left,0));
                }
                current.state++;
          }
          else if (current.state == 1)
          {
              if(current.node.right != null)
              {
                  stleft.add(new stPair(current.node.right,0));
              }
                current.state++;
                return current.node;
          }
          else {
                stleft.pop();
          }
      }
      return null;
  }
  public static Node rightin(Stack<stPair>stright)
  {
      while (stright.size() > 0) {
        stPair current = stright.peek();
        if(current.state==0)
        {
              if(current.node.right!=null)
              {
                  stright.add(new stPair(current.node.right,0));
              }
              current.state++;
        }
        else if (current.state == 1)
        {
            if(current.node.left != null)
            {
                stright.add(new stPair(current.node.left,0));
            }
              current.state++;
              return current.node;
        }
        else {
              stright.pop();
        }
      }
      return null;
  }
  public static void tsp(Node node, int target)
  {
      Stack<stPair> stleft = new Stack<>();
      Stack<stPair> stright = new Stack<>();

      stleft.push(new stPair(node,0));
      stright.push(new stPair(node,0));
    
      Node left = leftin(stleft);
      Node right = rightin(stright);
      
      while (left.data<right.data) {
          if(left.data+right.data<target)
          {
              left = leftin(stleft);
          }
          else if(right.data+left.data>target)
          {
              right = rightin(stright);
          }
          else 
          {
              System.out.println(left.data+" "+right.data);
              left = leftin(stleft);
              right = rightin(stright);
          }
      }

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

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    // write your code here
    tsp(root, data);
  }

}