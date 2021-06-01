import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack <Integer> stno = new Stack<Integer>();
    Stack<Character> stop = new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
        char ch = exp.charAt(i);
        if(Character.isDigit(ch))
        {
            stno.push(Integer.parseInt(String.valueOf(ch)));
        }
        else if (Character.compare(ch, '+')==0 || Character.compare(ch, '-')==0 || Character.compare(ch, '/')==0 || Character.compare(ch, '*')==0)
        {
            while (stop.size() > 0 && stop.peek()!='(' && power(stop.peek())>=power(ch) ) {
                int second = stno.pop();
                int first = stno.pop();
                char op = stop.pop();
                stno.push(operation(first,second,op));
            }  
            stop.push(ch);
        }

        else if (Character.compare(ch, '(')==0)
        {
            stop.push(ch);
        }
        else if  (Character.compare(ch, ')')==0){
            while (stop.size()>0 && stop.peek()!='(') {
                int second = stno.pop();
                int first = stno.pop();
                char op = stop.pop();
                stno.push(operation(first,second,op));
            }
            stop.pop();
        }
        }
      
        while (stop.size()>0) {
            int second = stno.pop();
            int first = stno.pop();
            char op = stop.pop();
            stno.push(operation(first, second, op));
        }
        System.out.print(stno.pop());
}

  
 

 public static int operation(int first, int second , char op) {
     if(op=='+')
     {
        return first + second;
     }
     else if(op=='-')
     {
         return first - second;
     }
     else if(op=='*')
     {
         return first * second;
     }
     else {
         return first / second;
     }
 }

 public static int power(char op) {
     if(op == '+' || op == '-')
     {
         return 0;
     }
     return 1;
 }
}