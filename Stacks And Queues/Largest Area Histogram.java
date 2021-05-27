import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    // code


    int l[] = new int[n];
    Stack<Integer> st = new Stack<Integer>();
    l[0] = -1;
    st.push(0);
    for (int i = 1; i < l.length; i++) {
        while (st.size()>0 && a[st.peek()]>=a[i]) {
            st.pop();
        }

        if(st.size()==0)
        {
            l[i] = -1;
        }
        else {
            l[i] = st.peek();
        }
        st.push(i);
    }

    int r[] = new int[n];
    r[n-1] = n;
    st = new Stack<Integer>();
    st.push(n-1);

    for (int i = n-2; i >=0; i--) {
        while (st.size()>0 && a[st.peek()]>=a[i]) {
            st.pop();
        }

        if(st.size()==0)
        {
            r[i] = n;
        }
        else {
            r[i] = st.peek();
        }
        st.push(i);
    }

    int max = 0;
    
    // for(int i=0;i<n;i++)
    // {
    //     System.out.println(l[i]+"---"+r[i]);
    // }

    for (int i = 0; i < n; i++) {
        max = Math.max(max, (r[i]-l[i]-1)*a[i]);
    }

    System.out.println(max);
 }
}