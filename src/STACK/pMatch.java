package STACK;
import java.util.*;

public class pMatch {
    public static void main(String[] args){
        try{System.out.println(match("((()))"));
        System.out.println(match("((())))"));
        System.out.println(match("(((((a))))))"));
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String parens) throws Exception{
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            }
            else {
                throw new Exception("Invalid Character");
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
}
