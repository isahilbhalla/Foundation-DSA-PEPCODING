import java.io.*;
import java.util.*;

public class Main {

  public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }

    int size() {
      // write your code here
      return mainQ.size();
    }

    void push(int val) {
      // write your code here
      mainQ.add(val);
      if(helperQ.size()>0)
      {
          helperQ.remove();
      }
      helperQ.add(val);
      
    //   System.out.println(mainQ+"---"+helperQ);
    }

    int pop() {
      // write your code here
      if(mainQ.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
     int val =  helperQ.remove(),topval=0;
    //  System.out.println(mainQ.size());
    
      
      while(mainQ.size()>1)
      {
           if(mainQ.size()==2)
        {
            topval=mainQ.peek();
        }
           helperQ.add(mainQ.remove());
      }
     
      
      mainQ = helperQ;
      helperQ = new ArrayDeque<>();
      helperQ.add(topval);
    //  System.out.println(mainQ+"---"+helperQ);
      return val;
    }

    int top() {
      // write your code here
      if(mainQ.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      return helperQ.peek();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    QueueToStackAdapter st = new QueueToStackAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}