import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = (n / 2) + 1, space = 1,t=n;
        while (n > 0) {
            if (n>(t/2)+1) {

                for (int i = 0; i < star; i++) {
                    System.out.print("*	");
                }

                for (int i = 0; i < space; i++) {
                    System.out.print("	");
                }

                space = space + 2;

                for (int i = 0; i < star; i++) {
                    System.out.print("*	");
                }

                star = star - 1;
            } else

            {   
                for (int i = 0; i < star; i++) {
                    System.out.print("*	");
                }

                for (int i = 0; i < space; i++) {
                    System.out.print("	");
                }

                space = space - 2;

                for (int i = 0; i < star; i++) {
                    System.out.print("*	");
                }
                star = star + 1;
                
            }

        System.out.println();
            n--;
        }
        
    }
    // write ur code here

}