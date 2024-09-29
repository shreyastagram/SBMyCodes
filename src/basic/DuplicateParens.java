package basic;
import java.util.*;
public class DuplicateParens {//BIG O IS O(n)
    public static void main(String[] args) {
        String inputString = "(a+((b+c))+(d+e))";
        System.out.println(duplicateParensCheck(inputString));
    }

    public static boolean duplicateParensCheck(String inputString) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                st.pop();
                int count = 0;
                while (top != '(') {
                    if (st.isEmpty()) {
                        return false;
                    }
                    top = st.peek();
                    st.pop();
                    count++;
                }
                if (count <= 1) {
                    return true;
                }
            }
        }
            return false;
        }
    }
