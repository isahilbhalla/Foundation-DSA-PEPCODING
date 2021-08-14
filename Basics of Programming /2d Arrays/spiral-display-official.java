import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int arr[][] = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int tp = r*c;
        int rowstart = 0 , rowend = r-1 , colstart = 0 , colend = c-1;
        while (tp>0) {
            //horizontaldown
            for (int i = rowstart; i <=rowend && tp>0; i++) {
                tp--;
                System.out.println(arr[i][colstart]);
            }
            colstart++;

            //verticalright

            for (int i = colstart; i <= colend && tp>0; i++) {
                tp--;
                System.out.println(arr[rowend][i]);
            }
            rowend--;

            //horizontalup

            for (int i = rowend; i >= rowstart && tp>0; i--) {
                tp--;
                System.out.println(arr[i][colend]);
            }

            colend--;
            //verticalleft

            for (int i = colend; i >= colstart && tp>0; i--) {
                tp--;
                System.out.println(arr[rowstart][i]);
            }
            rowstart++;
            
        }
    }

}