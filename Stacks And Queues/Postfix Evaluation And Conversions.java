import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code

    Stack<Integer> value = new Stack<Integer>();
    Stack<String> infix = new Stack<>();
    Stack<String> prefix = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            value.push(Integer.parseInt(String.valueOf(ch)));
            infix.push(ch+"");
            prefix.push(ch+"");
        }
        else 
        {
            String second = infix.pop();
            String first = infix.pop();
            infix.push("("+first+ch+second+")");
            second = prefix.pop();
            first = prefix.pop();
            prefix.push(ch+first+second);
            int s = value.pop();
            int f = value.pop();
            value.push(operation(f,s,ch));
        }

    }
    System.out.println(value.pop());
    System.out.println(infix.pop());
    System.out.println(prefix.pop());
 }

 public static int operation(int f,int s,int ch) {
     if (ch=='+') {
         return f+s;
     }
     else if (ch=='-')
     {
         return f-s;
     }
     else if (ch=='*')
     {
         return f*s;
     }

     return f/s;
 }
}