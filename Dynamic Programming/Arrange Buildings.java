import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    long n= scn.nextInt();

    long zeros = 1 , ones = 1 , total = 2 ;

    for(long i=2;i<=n;i++) {
        zeros =ones;
        ones = total;
        total = zeros+ones;
    }

    System.out.println(total*total);
 }

}