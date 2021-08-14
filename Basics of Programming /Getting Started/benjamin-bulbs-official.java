import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int i=1;
        while(i*i<=num)
        {
            System.out.println(i*i);
            i++;
        }
    }
}