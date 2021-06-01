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
    int k = Integer.parseInt(br.readLine());

    // code

    //next greatest element

    int nge[] = new int[n];

    nge[n-1] = n;

    Stack<Integer> st = new Stack<Integer>();

    st.push(n-1);

    for (int i = n-2; i >=0; i--) {
       while (st.size()>0 && a[st.peek()]< a[i]) {
          st.pop();
       }

       if (st.size()==0) {
          nge[i] = n;
       }
       else {
          nge[i] = st.peek();
       }
       st.push(i);
    //   System.out.println(nge[i]+"----"+st);
    }

// for(int i=0;i<n;i++)
// {
//     System.out.print(nge[i]+" ");
// }

// System.out.println();
    //window max.


    int max[] = new int[n];
    int i=0 , j=0;

    while (i<=n-k) {
       if(j<i)
       {
          j=i;
       }
       while (nge[j]<i+k) {
          j=nge[j];
       }
      System.out.println(a[j]);
       i++;
    }
 }
}