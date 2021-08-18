import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        
        int n = scn.nextInt();

        int first = 1 , second = 1 ;

        for (int i = 2; i <=n; i++) {
            int total = first + second;
            first = second;
            second = total;
        }

        System.out.println(second);
    }
}