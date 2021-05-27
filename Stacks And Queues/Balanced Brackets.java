import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<Character>();

        int flag = 0;
        while (str.length()>0) {
            if(Character.compare(str.charAt(0), '[') == 0 || Character.compare(str.charAt(0), '(') == 0 || Character.compare(str.charAt(0), '{') == 0)
            {
                st.push(str.charAt(0));
            }
            else if (Character.compare(str.charAt(0), ']') == 0)
            {
                if (st.size()>0 && Character.compare(st.peek(), '[') == 0) {
                    st.pop();
                }
                else
                {
                    flag=1;
                    break;
                }
            }
            else if (Character.compare(str.charAt(0),'}') == 0)
            {
                if (st.size()>0 && Character.compare(st.peek(), '{') == 0) {
                    st.pop();
                }
                else
                {
                    flag=1;
                    break;
                }
            }
            else if (Character.compare(str.charAt(0),')') == 0)
            {
                if (st.size()>0 && Character.compare(st.peek(), '(') == 0) {
                    st.pop();
                }
                else
                {
                    flag=1;
                    break;
                }
            }
            str = str.substring(1);
        }

        if (flag == 1 || st.size()>0) {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }

}