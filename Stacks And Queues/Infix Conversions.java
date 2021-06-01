import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    Stack<String> pre = new Stack<>();
    Stack<String> post = new Stack<>();
    Stack<Character> op = new Stack<Character>();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isAlphabetic(ch)) {
            pre.push(ch+"");
            post.push(ch+"");
        }
        else if (Character.compare(ch, '+')==0 || Character.compare(ch, '-')==0 || Character.compare(ch, '*')==0 || Character.compare(ch, '/')==0)
        {
            while (op.size()>0 && op.peek()!='(' && power(op.peek())>=power(ch)) {
                String second = pre.pop();
                String first = pre.pop();
                char opp = op.pop();
                pre.push(opp+first+second);
                second = post.pop();
                first = post.pop();
                post.push(first+second+opp);
            }
            op.push(ch);
        }
        else if (Character.compare(ch,'(')==0)
        {
            op.push(ch);
        }
        else if (Character.compare(ch,')')==0)
        {
            while (op.size()>0 && op.peek()!='(' ) {
                String second = pre.pop();
                String first = pre.pop();
                char opp = op.pop();
                pre.push(opp+first+second);
                second = post.pop();
                first = post.pop();
                post.push(first+second+opp);
            }
            op.pop();
        }
    }

    

    // code

    while (op.size()>0) {
        String second = pre.pop();
        String first = pre.pop();
        char opp = op.pop();
        pre.push(opp+first+second);
        second = post.pop();
        first = post.pop();
        post.push(first+second+opp);
    }

    System.out.println(post.pop());
    System.out.println(pre.pop());
 }

public static int power(char operator) {
    if (operator == '+' || operator=='-')
    {
        return 0; 
    }
    return 1;
}


}