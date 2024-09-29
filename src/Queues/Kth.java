package Queues;
import java.util.Scanner;
import java.util.*;
public class Kth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> Us = new Stack<>();
        System.out.println("Enter the number of elements");

        int n = sc.nextInt();
System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            Us.push(sc.nextInt());
        }
        System.out.println("Enter the Kth Largest Element You want to Find");
        int Kth=sc.nextInt();

       System.out.println(sorted((Us),Kth));
        sc.close();
    }
    public static int sorted(Stack<Integer> Us,int Kth){
        Stack<Integer> sStack = new Stack<Integer>();
        int temp;
        sStack.push(Us.pop());
        while(!Us.isEmpty()){
            temp=Us.pop();
            while(!sStack.isEmpty() && sStack.peek()>temp){
                Us.push(sStack.pop());
            }
            sStack.push(temp);
        }
        int var=0;
        for(int i=0;i<Kth;i++){
            var=sStack.pop();
        }

        return var;

    }
}
