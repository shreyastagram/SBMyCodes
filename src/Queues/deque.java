package Queues;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
public class deque {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String Palindrome=sc.nextLine();
        System.out.println(isPalindrome(Palindrome));
    }
    public static boolean isPalindrome(String Palindrome){
        Deque<Character> dequee=new LinkedList<>();
        char[] chars=Palindrome.toCharArray();
        for(char c:chars){
            dequee.addLast(c);
        }
        while(dequee.size()>1){
            char first=dequee.removeFirst();
            char last=dequee.removeLast();
            if(first!=last){
                return false;
            }

        }
        return true;
    }
}
