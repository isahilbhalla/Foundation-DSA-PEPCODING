import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int rot = scn.nextInt();

        int rowstart = s-1 , rowend = r-s , colstart = s-1 , colend = c-s;
        int tn = 2*(colend-colstart) + 2*(rowend-rowstart);
        int larr[] = new int[tn] , k=0;

        //hd
        for (int i = rowstart; i <= rowend; i++) {
            larr[k] = arr[i][colstart];
            k++;
        }

        colstart++;

        //vr

        for (int i = colstart; i <= colend; i++)  {
            larr[k] = arr[rowend][i];
            k++;
        }

        rowend--;

        //hu
        for (int i = rowend; i >= rowstart; i--) {
            larr[k] = arr[i][colend];
            k++;
        }

        colend--;

        //vl
        for (int i = colend; i >= colstart; i--)  {
            larr[k] = arr[rowstart][i];
            k++;
        }
        //  System.out.println(rot +"---"+tn);
        rot = rot%tn;
        //  System.out.println(rot);
        if(rot<0)
        {
            rot=rot+tn;
            //  System.out.println(rot);
        }
        
        // for(int i=0;i<larr.length;i++)
        // {
        //     System.out.print(larr[i]+"	");
        // }
        // System.out.println();
        
         rotation(larr,0,larr.length-1);
        
        // for(int i=0;i<larr.length;i++)
        // {
        //     System.out.print(larr[i]+"	");
        // }
        // System.out.println(rot);
        
        rotation(larr,0,rot-1);
        
        // for(int i=0;i<larr.length;i++)
        // {
        //     System.out.print(larr[i]+"	");
        // }
        // System.out.println();
        
         rotation(larr,rot,larr.length-1);
         
        //  for(int i=0;i<larr.length;i++)
        // {
        //     System.out.print(larr[i]+"	");
        // }
        // System.out.println();

        rowstart = s-1 ; rowend = r-s ; colstart = s-1 ; colend = c-s;
        k=0;
         //hd
         for (int i = rowstart; i <= rowend; i++) {
            arr[i][colstart] = larr[k];
            k++;
        }

        colstart++;

        //vr

        for (int i = colstart; i <= colend; i++)  {
            arr[rowend][i] = larr[k];
            k++;
        }

        rowend--;

        //hu
        for (int i = rowend; i >= rowstart; i--) {
            arr[i][colend] = larr[k];
            k++;
        }

        colend--;

        //vl
        for (int i = colend; i >= colstart; i--)  {
            arr[rowstart][i] = larr[k];
            k++;
        }

        display(arr);

    }

    public static void rotation(int arr[], int start, int end)
    {   int endpt = end;
        for (int i = start; i <= (start+end)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[endpt];
            arr[endpt] = temp;
            endpt--;
        }
        // return arr;
    }    
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}