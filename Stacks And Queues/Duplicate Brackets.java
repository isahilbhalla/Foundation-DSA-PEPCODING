import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        int flag =0;
        while (str.length()>0) {
            if (Character.compare(str.charAt(0), '(')==0) {
                st.push('(');
            }
            else if (Character.compare(str.charAt(0),')') == 0)
            {
                if(st.size()>1)
                {
                    st.pop();
                    st.pop();
                }
                else {
                    flag=1;
                    break;
                }
            }
            else 
            {
                if(st.size()>0 && Character.compare(st.peek(), '*')!=0)
                {
                    st.push('*');
                }
            }
            str = str.substring(1);

        }


    if(st.size()!=0 || flag==1)
    {
        System.out.println("true");
    }
    else
    {
        System.out.println("false");
    }
    }


}