import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
    }

    HashMap<Integer,Boolean> hm = new HashMap<>();

    for (int val : arr) {
        hm.put(val,true);
    }

    for (int val : arr) {
        if(hm.containsKey(val-1))
        {
            hm.put(val,false);
        }
    }
    int st=0,range=0;
    for (int val : arr) {
        if(hm.get(val)==true)
        {
            int tst=val,trange=1;

            while(hm.containsKey(tst+trange))
            {
                trange++;
            }

            if(trange>range)
            {
                range = trange;
                st = val;
            }

        }
    }

    for (int i = 0; i < range; i++) {
        System.out.println(st+i);
    }
 }

}