package STACK;
import java.util.*;

public class Stack2 {
    public static void main(String []args){
        Stack<Character> s=new Stack<>();
        Scanner in=new Scanner(System.in);
        String data=in.nextLine();
        String reversed=reverseString(s,data);
        System.out.println(reversed);
    }
    static String reverseString(Stack<Character> s,String data){
        for(char c:data.toCharArray()){
            s.push(c);
        }
        StringBuilder reversed=new StringBuilder();
        while(!s.isEmpty()){
            reversed.append(s.pop());
        }
        return reversed.toString();

    }
}
