// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0;i<n;i++) {
//             arr[i] = scn.nextInt();
//         }

//         int inco = arr[0] , ninco = 0 ;

//         for(int i = 1;i<n;i++)
//         {
//             int max = Math.max(inco,ninco);
//             inco = ninco + arr[i];
//             ninco = max;   
//         }

//         System.out.println(Math.max(inco,ninco));
//     }
// }





import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for (int i = 0;i<n;i++) {
            arr[i] = scn.nextInt();
        }

        int inco = arr[0] , ninco = 0 , incn =0 , nincn = 0;

        for(int i = 1;i<n;i++)
        {
            int max = Math.max(inco,ninco);
            inco = ninco + arr[i];
            ninco = max;   
        }

        System.out.println(Math.max(inco,ninco));
    }
}