package basic;
import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        paliCheck(inputString);
    }

    public static boolean paliCheck(String inputString) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<inputString.length();i++){
            stack.push(inputString.charAt(i));
        }
        StringBuilder reverseString= new StringBuilder();

        while(!stack.isEmpty()){
            reverseString.append(stack.pop());
        }
        boolean isPalindrome=inputString.equals(reverseString.toString());
        if(isPalindrome){
            System.out.println("The input String is a palindrome");
        }
        else{
            System.out.println("The Input String is a not a palindrome");
        }
        return isPalindrome;
    }
}
