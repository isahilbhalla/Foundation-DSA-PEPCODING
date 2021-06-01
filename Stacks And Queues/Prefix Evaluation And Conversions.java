import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
Stack<Integer> value = new Stack<>();
Stack<String> infix = new Stack<>();
Stack<String> postfix = new Stack<>();

for (int i = str.length()-1; i >=0; i--) {
    char ch = str.charAt(i);
    if (Character.isDigit(ch)) {
        value.push(Integer.parseInt(String.valueOf(ch)));
        infix.push(ch+"");
        postfix.push(ch+"");
    }
    else {
        String first = infix.pop();
        String second = infix.pop();
        infix.push("("+first+ch+second+")");
        first = postfix.pop();
        second = postfix.pop();
        postfix.push(first+second+ch);
        int f= value.pop();
        int s= value.pop();
        value.push(operation(f,s,ch));
    }
}
 
System.out.println(value.pop());
System.out.println(infix.pop());
System.out.println(postfix.pop());
}

public static int operation(int f, int s,char ch) {
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