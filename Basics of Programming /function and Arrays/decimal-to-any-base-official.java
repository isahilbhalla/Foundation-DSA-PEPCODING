import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        String ans = "";
        while (n>0) {
            ans = n%b +ans;
            n=n/b;
        }
        return Integer.parseInt(ans);
    }
}