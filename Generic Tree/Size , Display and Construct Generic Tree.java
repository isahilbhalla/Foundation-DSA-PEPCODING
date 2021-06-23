import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    System.out.print(node.data+" -> ");
    for (int i = 0; i < node.children.size(); i++) {
      System.out.print(node.children.get(i)+ ", ");
    }
    System.out.println(".");

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
   Node root = null;
   Stack<Node> st = new Stack<>();
   for (int i = 0; i < arr.length; i++) {
     int val = arr[i];
     if (val==-1) {
      st.pop();
    }
    else {
      Node temp = new Node();
         temp.data = val;
      if(st.size()==0)
     {
        root = temp;
     }
     else {
        st.peek().children.add(temp);
     }
     st.push(root);
    }
     }
     return root;
   }
  
  
  public static int size(Node node){
    // write your code here
    int size =0;

    for (Node child : node.children)
    {
     size+= size(child);
    }
    return size+1;
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
    int sz = size(root);
    System.out.println(sz);
    // display(root);
  }

}