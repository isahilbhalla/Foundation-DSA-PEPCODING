import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int same = 0 , different = k , total = same+ different;
        
        for (int i = 2; i <= n; i++) {
            same = different;
            different = total * (k-1);
            total = same+ different;
        }

        System.out.println(total);
    }
}