import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch, 1);
            }
        }

        int max=0; // int max = hm.get(mch);
        char mch=' '; // char mch = str.charAt(0);


        for (Character ch :  hm.keySet()) {
            if(hm.get(ch)>max)
            {
                max=hm.get(ch);
                mch=ch;
            }
        }
        
        System.out.println(mch);
    }

}