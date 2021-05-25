import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[][] = new int [n][3];

        for (int i=0;i<n;i++) {
            for (int j=0;j<3;j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int ro = arr[0][0] , bo = arr[0][1] , go = arr[0][2] , rn = 0 , bn = 0 , gn = 0;

        for (int i=1;i<n;i++) {
            rn = Math.min(bo,go)+arr[i][0];
            bn = Math.min(ro,go)+arr[i][1];
            gn = Math.min(ro,bo)+arr[i][2];

            ro = rn;
            bo = bn;
            go = gn;
        }

        System.out.println(Math.min(ro,Math.min(bo,go)));
    }
}