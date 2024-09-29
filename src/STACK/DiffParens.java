package STACK;
import java.util.EmptyStackException;
import java.util.Stack;
public class DiffParens {
    public static void main(String[] args) throws Exception{
        System.out.println(match("{([{[})]})]}])}"));

    }
    public static boolean match(String parens) throws Exception{
        Stack<Character> stack = new Stack();

        for (char c : parens.toCharArray()) {
            if (c == '(' || c == '{'||c=='[') {
                stack.push(c);
            } else if (c == ')') {
                try {
                    char t = stack.pop();
                    if (t != '(') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            } else if (c == '}') {
                try {
                    char t = stack.pop();
                    if (t != '{') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }

            }
            else if (c == ']') {
                try {
                    char t = stack.pop();
                    if (t != '[') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }else {
                throw new Exception("Unexpected Character " + c);
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
