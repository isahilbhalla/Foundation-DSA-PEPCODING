import java.io.*;
import java.util.*;



public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state)
        {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node node)
    {
        if(node == null)
        {
            return;
        }
        String str = "";
        str+= node.left==null? "." : node.left.data+"";
        str+=" <- " + node.data + " -> ";
        str+=node.right==null? "." : node.right.data+"";
        System.out.println(str);

        display(node.left);
        display(node.right);


    }

    public static Node construct(Integer arr[])
    {
        Node root = new Node(arr[0],null,null);
        Stack<Pair>st = new Stack<>();
        st.push(new Pair(root,1));

        int index = 0;
        while(st.size()>0)
        {
            Pair top = st.peek();
            if(top.state==1)
            {   
                index++;
                if(arr[index]!=null)
                {
                    top.node.left = new Node(arr[index],null,null);
                    st.push(new Pair(top.node.left,1));
                }
                else {
                    top.node.left = null;
                }               
                top.state+=1;
            }
            else if (top.state==2)
            {
                index++;
                if (arr[index]!=null) {
                    top.node.right = new Node(arr[index],null,null);
                    st.push(new Pair(top.node.right,1));
                }
                else {
                    top.node.right = null;
                }
                top.state+=1;
            }
            else {
                st.pop();
            }
        }
        
        return root;
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
    display(root);
    }
}
