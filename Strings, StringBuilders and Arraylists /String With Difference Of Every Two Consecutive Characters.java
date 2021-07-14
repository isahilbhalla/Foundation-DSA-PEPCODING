import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
        StringBuilder strb = new StringBuilder();
        strb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = current - prev;

            strb.append(gap);
            strb.append(current);
        }
		return strb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}