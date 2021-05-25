import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        //base
        if(n==0)
        {
            return;
        }
        //faith
        System.out.println(n);
        //expectation
        printDecreasing(n-1);
    }

}