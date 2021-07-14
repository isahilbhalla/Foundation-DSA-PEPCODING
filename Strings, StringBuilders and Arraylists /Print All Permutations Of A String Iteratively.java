import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
        int n = str.length();
        int fac = factorial(n);

        for (int i = 0; i < fac; i++) {
            StringBuilder strb = new StringBuilder(str);
            int temp = i;
            for (int j = n; j >=1; j--) {
                int q = temp/j;
                int r = temp % j;

                System.out.print(strb.charAt(r));
                strb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n)
    {
        int ans=1;
        for(int i=n;i>1;i--)
        {
            ans*=i;
        }
        return ans;
    } 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}