import java.io.*;
import java.util.*;

public class Main {

    public static class Item implements Comparable<Item>
    {
        int val , weight;
        double ratio;

        public int compareTo(Item obj)
        {
            if(this.ratio == obj.ratio)
            {
                return 0;
            }
            else if(this.ratio > obj.ratio)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }


    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val[] = new int[n];
        int weight[] = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            val[i] = scn.nextInt();
        }

        for(int i = 0; i<n;i++)
        {
            weight[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        Item arr[] = new Item[n];

        for(int i = 0; i<n;i++)
        {
            Item temp = new Item();
            temp.val = val[i];
            temp.weight = weight[i];
            temp.ratio = (temp.val*1.0)/temp.weight;
            arr[i] = temp;
        }

        Arrays.sort(arr);

        double ans=0.0;
        int i=arr.length-1;
        while(i>=0)
        {
            if(arr[i].weight<=cap)
            {
                ans+= arr[i].val;
                cap-= arr[i].weight;
            }
            else
            {
                ans+= cap*arr[i].ratio;
                cap=0;
                break;
            }
            i--;
        }

        System.out.println(ans);

    }
}