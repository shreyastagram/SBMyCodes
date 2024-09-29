package STACK;
import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;
public class rainfall {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int S[]=new int[n];
        difference(height,S);
        for (int i = 0; i < n; i++) {
            System.out.print(S[i] + " ");
        }
    }
    public static void difference(int[] height,int[] S){
        Stack<Integer> s1=new Stack<>();
        s1.push(0);
        S[0]=1;
        for(int i=1;i<height.length;i++) {
            while (!s1.isEmpty() && height[s1.peek()] <= height[i]) {
                s1.pop();
            }
            if (s1.isEmpty()) {
                S[i] = i + 1;
            } else {
                S[i] = i - s1.peek();
            }
            s1.push(i);
        }
    }
}
