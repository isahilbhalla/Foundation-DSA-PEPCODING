import java.io.*;
import java.util.*;



public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        pair sarr[] = new pair[arr.length];

        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = new pair(arr[i][0],arr[i][1]);
        }

        Arrays.sort(sarr);

        Stack<pair> st = new Stack<>();
        
        for (int i = 0; i < sarr.length; i++) {
            if(i==0)
            {
                st.push(sarr[i]);
            }
            else {
                if(st.peek().et>=sarr[i].st)
                {
                    st.peek().et = Math.max(st.peek().et,sarr[i].et);
                }
                else {
                    st.push(sarr[i]);
                }
            }
        }

        Stack<pair>rst = new Stack<>();

        while (st.size()>0) {
            rst.push(st.pop());
        }

        while (rst.size()>0) {
            System.out.println(rst.peek().st+" "+rst.pop().et);
        }
    }

    public static class pair implements Comparable<pair> {
        int st , et;

        pair(int st,int et) {
            this.et = et;
            this.st = st;
        }

        public int compareTo(pair obj)
        {
            if(this.st != obj.st)
            {
                return this.st - obj.st;
            }
            return this.et - obj.et;
        }
    }
}