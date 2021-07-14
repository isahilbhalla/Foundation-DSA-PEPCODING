import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here

		String ans = "";
        ans+=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            if(current != prev)
            {
                ans+=current;
            }
        }
		return ans;
	}

	public static String compression2(String str){
		// write your code here
        String ans = "";
        ans+=str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            if(current !=prev)
            {
                if(count>1)
                {
                    ans+=count;
                }
                ans+=current;
                count=1;
            }
            else
            {
                count++;
            }
        }
        if(count>1)
        {
            ans+=count;
        }
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}