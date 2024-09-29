package STACK;
import java.util.*;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        Scanner in=new Scanner(System.in);
        try {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                s.push(in.nextInt());
            }
            System.out.println(SecondHalfReverse(s));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input detected. Please enter a valid integer value.");

            }
        }
    public static Stack<Integer> SecondHalfReverse(Stack<Integer> s){
        int centre=s.size()/2;
        int[] arr=new int[centre];
        int n=s.size();
        if(n==0||n==1){
            return s;
        }
       else {
            for (int i = 0; i < centre; i++) {
                arr[i] = s.pop();
            }
            for (int i:arr) {
                s.push(i);
            }
        }
       return s;
    }
}
