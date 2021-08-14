import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int div = 2;
        
        while(div*div<=num)
        {
            if (num % div == 0) {
                System.out.print(div + " ");
                num = num / div;
            } else {
                div++;
            }
        }
        if(num>1)
        {
            System.out.println(num+" ");
        }
        
    
    }
}