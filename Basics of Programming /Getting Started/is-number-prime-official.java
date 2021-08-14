import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for (int i = 0; i < tc; i++) {
            int flag = 1;
            int num = scn.nextInt();
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    flag = 0;
                    System.out.println("not prime");
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("prime");
            }
        }
        // write ur code here

    }
}