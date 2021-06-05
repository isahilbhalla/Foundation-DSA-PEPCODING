import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    Stack<Integer> st = new Stack<>();
    int c=1;
    while (str.length() > 0 ) {
        char ch = str.charAt(0);
        st.push(c);
        if(ch=='i')
        {
            while (st.size() >0) {
                System.out.print(st.pop());
            }
        }
        c++;
        str = str.substring(1);
    }
    
    System.out.print(c);
    while (st.size() >0) {
        System.out.print(st.pop());
    }
}
}