import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        //base
        if (n==0) {
            return;
        }
         //expectation
         printIncreasing(n-1);
        //faith
        System.out.println(n);
        
       
    }

}