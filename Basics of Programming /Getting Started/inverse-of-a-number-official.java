import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0, i = 1;
        while (n > 0) {
            int val = n % 10;
            int p = 1;
            while (val > 1) {
                p = p * 10;
                val--;
            }
            ans = ans + (i * p);
            n = n / 10;
            i++;
        }
        System.out.println(ans);
    }
}