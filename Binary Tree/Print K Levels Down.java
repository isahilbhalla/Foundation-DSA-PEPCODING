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

  public static void printKLevelsDown(Node node, int k){
    // write your code here
    if(k<0 || node==null){
        return;
    }
    if(k==0)
    {
        System.out.println(node.data);
        return;
    }

    printKLevelsDown(node.left, k-1);
    printKLevelsDown(node.right, k-1);
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

    int k = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    printKLevelsDown(root, k);
  }

}







// import java.io.*;
// import java.util.*;

// public class Main {
//   public static class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data, Node left, Node right) {
//       this.data = data;
//       this.left = left;
//       this.right = right;
//     }
//   }

//   public static class Pair {
//     Node node;
//     int state;

//     Pair(Node node, int state) {
//       this.node = node;
//       this.state = state;
//     }
//   }

//   public static Node construct(Integer[] arr) {
//     Node root = new Node(arr[0], null, null);
//     Pair rtp = new Pair(root, 1);

//     Stack<Pair> st = new Stack<>();
//     st.push(rtp);

//     int idx = 0;
//     while (st.size() > 0) {
//       Pair top = st.peek();
//       if (top.state == 1) {
//         idx++;
//         if (arr[idx] != null) {
//           top.node.left = new Node(arr[idx], null, null);
//           Pair lp = new Pair(top.node.left, 1);
//           st.push(lp);
//         } else {
//           top.node.left = null;
//         }

//         top.state++;
//       } else if (top.state == 2) {
//         idx++;
//         if (arr[idx] != null) {
//           top.node.right = new Node(arr[idx], null, null);
//           Pair rp = new Pair(top.node.right, 1);
//           st.push(rp);
//         } else {
//           top.node.right = null;
//         }

//         top.state++;
//       } else {
//         st.pop();
//       }
//     }

//     return root;
//   }

//   public static void display(Node node) {
//     if (node == null) {
//       return;
//     }

//     String str = "";
//     str += node.left == null ? "." : node.left.data + "";
//     str += " <- " + node.data + " -> ";
//     str += node.right == null ? "." : node.right.data + "";
//     System.out.println(str);

//     display(node.left);
//     display(node.right);
//   }

//   public static void printKLevelsDown(Node node, int k){
//     // write your code here\
//     Queue<Pair> parent = new ArrayDeque<>();
//     Queue<Pair> child = new ArrayDeque<>();

//     parent.add(new Pair(node,0));
    
//     while(parent.size() > 0)
//     {
        
//         Pair current = parent.remove();
//         if(current.state==k)
//         {
//             System.out.println(current.node.data);
//             while (parent.size() > 0) {
//                 current = parent.remove();
//                 System.out.println(current.node.data);
//             }
//             break;
//         }
//         if(current.node.left != null)
//         {
//             child.add(new Pair(current.node.left,current.state+1));
//         }
//         if(current.node.right != null)
//         {
//             child.add(new Pair(current.node.right,current.state+1));
//         }
        
//         if(parent.size() == 0)
//         {
//             Queue<Pair> temp = parent;
//             parent = child;
//             child = temp;
//         }
//     }
//   }

//   public static void main(String[] args) throws Exception {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int n = Integer.parseInt(br.readLine());
//     Integer[] arr = new Integer[n];
//     String[] values = br.readLine().split(" ");
//     for (int i = 0; i < n; i++) {
//       if (values[i].equals("n") == false) {
//         arr[i] = Integer.parseInt(values[i]);
//       } else {
//         arr[i] = null;
//       }
//     }

//     int k = Integer.parseInt(br.readLine());

//     Node root = construct(arr);
//     printKLevelsDown(root, k);
//   }

// }