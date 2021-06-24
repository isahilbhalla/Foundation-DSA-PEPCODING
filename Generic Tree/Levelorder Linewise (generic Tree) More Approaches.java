import java.io.*;
import java.util.*;

public class Main {
    public static class Pair{
        Node node;
        int level;
        Pair()
        {

        }
        Pair(Node node,int level)
        {
            this.node = node;
            this.level = level;
        }
    }
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node()
    {

    }

    Node(int data)
    {
        this.data=data;
    }
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

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  public static void traversals(Node node){
    System.out.println("Node Pre " + node.data);

    for(Node child: node.children){
      System.out.println("Edge Pre " + node.data + "--" + child.data);
      traversals(child);
      System.out.println("Edge Post " + node.data + "--" + child.data);
    }

    System.out.println("Node Post " + node.data);
  }

  public static void levelOrderLinewise(Node node){
    // write your code here
    Queue<Node> current = new ArrayDeque<>();
    Queue<Node> child = new ArrayDeque<>();

    current.add(node);
    while(current.size()>0)
    {
        while(current.size()>0)
        {
            System.out.print(current.peek().data+" ");
            for(Node ch : current.peek().children)
            {
                child.add(ch);
            }
            current.remove();
        }
        System.out.println();

        Queue<Node> temp = child;
        child=current;
        current=temp;
    }
    
  }

  public static void levelOrderLinewise2(Node node) // single queue and use marker
  {
      Queue<Node>mq = new ArrayDeque<>();
      mq.add(node);
      mq.add(new Node(-1) );

      while (mq.size()>0) {
          Node current = mq.remove();
          if(current.data==-1)
          {
            System.out.println();
            if(mq.size()>0)
            {
                mq.add(new Node(-1));
            }
            
          }
          else  {
                System.out.print(current.data+" ");
                for (Node n : current.children) {
                    mq.add(n);
                }
          }
      }
  }

  public static void levelOrderLinewise3(Node node) // count children
  {
    Queue<Node>mq = new ArrayDeque<>();
    mq.add(node);
    
    while(mq.size()>0)
    {
        int limit  = mq.size();

        for(int i=0;i<limit;i++)
        {
            Node current = mq.remove();
            System.out.print(current.data+" ");
            for(Node ch : current.children)
            {
                mq.add(ch);
            }
        }
        System.out.println();
    }
  }
  
  public static void levelOrderLinewise4(Node node)
  {
        Queue<Pair> mq = new ArrayDeque<>();
        mq.add(new Pair(node,0));
        int clevel=0;
        while(mq.size()>0)
        {
            Pair current = mq.remove();
            if(current.level>clevel)
            {
                System.out.println();
                clevel = current.level;
            }
            System.out.print(current.node.data+" ");
            for(Node ch : current.node.children)
            {
                mq.add(new Pair(ch,clevel+1));
            }
        }
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
    levelOrderLinewise4(root);
  }

}