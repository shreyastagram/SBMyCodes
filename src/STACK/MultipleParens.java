package STACK;
import java.util.*;

public class MultipleParens {
    public static void main(String[] args) throws Exception {
        Stack<Character> stack = new Stack<>();
        try {
            System.out.println(match("{{}}(())", stack));
            System.out.println(match("{{{{(a((())))}}}}", stack));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String s, Stack<Character> stack) throws Exception{
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{') {
                stack.push(c);
            }
            else if (c == ')') {
                try {
                    char t = stack.pop();
                    if (t != '(') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
            else if (c == '}') {
                try {
                    char t = stack.pop();
                    if (t != '{') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
            else{
                throw new Exception("Invalid character : "+c);
            }
        }
        return stack.isEmpty();
    }
}
