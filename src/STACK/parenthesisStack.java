package STACK;
import java.util.*;

public class parenthesisStack {
    public static void main(String[] args)throws Exception {
        Stack<Character> stack=new Stack<>();
        try {
            System.out.println(match("(((())))", stack));
            System.out.println(match("((((())))", stack));
            System.out.println(match("(((()a)))", stack));
            System.out.println(match("{{{{(((())))}}}}", stack));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static boolean match(String parens,Stack<Character> stack) throws Exception{
        for (char c : parens.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            else throw new Exception("Unexpected Character : "+ c);
        }
        return stack.isEmpty();//this is a simplified version of if else it will return
        // true if its empty and false if it's not empty and if the
        //answer is true then the parenthesis are in well-formed manner=else they are ill formed
    }
}
