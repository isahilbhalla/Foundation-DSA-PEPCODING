import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];
    for (int i = 0; i < a1.length; i++) {
        a1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int a2[] = new int [n2];
    for (int i = 0; i < a2.length; i++) {
        a2[i] = scn.nextInt();
    }

    HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();

    for (int val : a1) {
        if(hm1.containsKey(val))
        {
            hm1.put(val,hm1.get(val)+1);
        }
        else {
            hm1.put(val,1);
        }
    }

    for (int val : a2) {
        if(hm1.containsKey(val))
        {
            int valvalue = hm1.get(val);
            System.out.println(val);
            hm1.put(val,hm1.get(val)-1);
            
            if(valvalue-1==0)
            {
                hm1.remove(val);
            }
        }
    }
 }

}