import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
        StringBuilder strb = new StringBuilder(str);

        for (int i = 0; i < strb.length(); i++) {
            char ch = strb.charAt(i);
            if (ch>='a' && ch<='z') {
                char ans = (char)('A'+ch-'a');
                strb.setCharAt(i,ans);
            }
            else 
            {
                char ans = (char)('a'+ch-'A');
                strb.setCharAt(i,ans);
            }
        }
		return strb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}