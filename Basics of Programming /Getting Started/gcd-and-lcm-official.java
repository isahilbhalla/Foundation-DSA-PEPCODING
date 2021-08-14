import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

       int r, t1=n1,t2=n2;
       while (n2!=0) {
           r = n1%n2;
           n1 = n2;
           n2 = r;
       }

       System.out.println(n1);
       System.out.println((t1*t2)/n1);
        }
    }