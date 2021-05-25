import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();

    if(n<=1)
    {
        System.out.println(n);
        return;
    }
    int a=0,b=1,sum=0;
    for(int i=2;i<=n;i++)
    {
        
        sum=a+b;
        a=b;
        b=sum;
    }

    System.out.print(sum);
 }

}