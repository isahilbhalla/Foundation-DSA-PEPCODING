import java.io.*;
import java.util.*;

public class Main {

    public static boolean pallindrome(String str)
    {
        int i =0;
        int j=str.length()-1;
      

        while (i<=j) {
              char lch=str.charAt(i);
        char rch=str.charAt(j);
            if(lch!=rch)
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
	public static void solution(String str){
		//write your code here
		for(int i = 0; i < str.length(); i++){
            for (int j =i+1; j <= str.length(); j++) {
                if(pallindrome(str.substring(i,j)))
                {
                    System.out.println(str.substring(i,j));
                }
            }
        }
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}