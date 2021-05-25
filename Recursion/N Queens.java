import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNQueens(new int [n][n],"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        //base
        //faith
        //expectation

        if(row==chess.length)
        {
            System.out.println(qsf+".");
            return;
        }

        for (int i = 0; i < chess[0].length; i++) {
            int flag=0;

            //up
            for(int ir=0;ir<row ;ir++)
            {
                if(chess[ir][i]==1)
                {
                    flag=1;
                    break;
                }
            }
            //left
            int cr = row-1, cc = i-1;
            while (cr>=0 && cc>=0 && flag==0 ){
                if(chess[cr][cc]==1)
                {
                    flag=1;
                    break;
                }
                cr--;
                cc--;
            }
            //right

            cr = row-1;cc = i+1;
            while (cr>=0 && cc<chess[0].length && flag==0) {
                if(chess[cr][cc]==1)
                {
                    flag=1;
                    break;
                }
                cr--;
                cc++;
            }

            if(flag==0)
            {
                chess[row][i]=1;
                printNQueens(chess, qsf+row+"-"+i+", ", row+1);
                chess[row][i]=0;
            }
        }
    }
}