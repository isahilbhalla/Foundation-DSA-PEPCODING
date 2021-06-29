import java.io.*;
import java.util.*;

public class Main {

    public static class Pair
  {
    Node node;
    int state;

    Pair()
    {

    }

    Pair(Node node,int state)
    {
      this.node = node;
      this.state = state;
    }
  }
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

  public static void IterativePreandPostOrder(Node node) {
    // write your code here
    Stack<Pair>st = new Stack<>();
    String pre = "";
    String post = "";
    st.push(new Pair(node,-1));
    while (st.size()!=0) {
        Pair top = st.peek();
        if(top.state==-1)
        {
            pre+=top.node.data+" ";
            top.state+=1;
        }
        else if (top.state>=0 && top.state<top.node.children.size()) {
          int child = top.state;
          top.state+=1;
          st.push(new Pair(top.node.children.get(child),-1));
        }
        else {
            post+=top.node.data+" ";
          st.pop();
        }
      }

      System.out.println(pre);
      System.out.println(post);
  
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
    IterativePreandPostOrder(root);
  }

}