// import java.io.*;
// import java.util.*;

// public class Main{

// public static void main(String[] args) throws Exception {
//     // write your code here
//     Scanner scn = new Scanner(System.in);
//     int n= scn.nextInt();

//     int zeros = 1 , ones = 1 , total = 2 ;

//     for(int i=2;i<=n;i++) {
//         zeros =ones;
//         ones = total;
//         total = zeros+ones;
//     }

//     System.out.println(total);
//  }

// }



import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();

    int first = 0 , second = 1 , third = 0 ;

    for(int i=1;i<=n+1;i++) {
        third = first + second;
        first = second;
        second = third;
    }

    System.out.println(second);
 }

}