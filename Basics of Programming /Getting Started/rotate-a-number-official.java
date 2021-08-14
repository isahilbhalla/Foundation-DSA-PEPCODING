import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();

     int localnum = n , ltn =0;
     while (localnum>0) {
         localnum= localnum/10;
         ltn++;
     }

     k=k%ltn;
     if(k<0)
     {
         k=k+ltn;
     }

     int p=1;
     int rot = k;
     while (rot>0) {
         p=p*10;
         rot--;
     }

     int part1 = n%p;
     n=n/p;

     //length of n
     int temp = n ,tn = 0;
     while (temp>0) {
         temp = temp/10;
         tn++;
     }

     //power
      p=1;
   
     while (tn>0) {
         p=p*10;
         tn--;
     }

     part1 = part1*p ;
     n=part1+n;

     System.out.println(n);
    }
   }