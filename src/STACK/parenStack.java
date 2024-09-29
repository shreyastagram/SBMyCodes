package STACK;
import java.util.LinkedList;
import java.util.EmptyStackException;
import java.util.*;

public class parenStack {


    private static MyStackk<Character> stack = new MyStackk<>();

    public static void main(String[] args) throws Exception {

            System.out.println(match("()()()()()"));
            System.out.println(match("(((()))))"));
            System.out.println(match("((()))"));
    }
    private static boolean match(String parens) throws Exception{
        for (char c : parens.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
               if(!stack.isEmpty()){
                   stack.pop();
               }
               else{
                   return false;
               }
            } else {
                throw new Exception("Unexpected character"+c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}