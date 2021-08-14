import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here  
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt() , b = scn.nextInt() , c= scn.nextInt();
        int lhs = (a*a) , rhs = (c*c)+(b*b) , lhs1 = (a*a)+(b*b), rhs1 = (c*c);
        if(lhs==rhs || lhs1==rhs1)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}