import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // int tp = r*c;
        int flag = 1;
        // while(tp>0)
        // {
            for (int i = 0; i < c; i++) {
                if(flag==1)
                {
                    for (int j = 0; j < r; j++) {
                        System.out.println(arr[j][i]);
                        // tp--;
                    }
                }
                else
                {
                    for (int j = r-1; j >=0; j--) {
                        System.out.println(arr[j][i]);
                        // tp--;
                    }
                }
                flag = flag*-1;
            }

            
            
        // }
        

    }

}