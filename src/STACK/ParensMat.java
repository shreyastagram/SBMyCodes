package STACK;
import java.util.*;
public class ParensMat {
    public static void main(String[] args)throws Exception{
        try{
            System.out.println(match("()"));
            System.out.println(match("((()))(())"));
            System.out.println(match("(())(())("));
            System.out.println(match("()()))"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean match(String parens)throws Exception{
        int count=0;
        char[] chars=parens.toCharArray();
        for(char c:chars){
            if(c == '('){
                count++;
            }
            else if(c==')'){
                if(count>0) {
                    count--;
                }
                else{
                    return false;
                }
            }
            else{
                throw new Exception("Invalid charecter");
            }
        }
        if(count ==0) {
            return true;
        }
        else{return false;}




        }
    }
