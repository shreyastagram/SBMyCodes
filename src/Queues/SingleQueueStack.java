package Queues;
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
public class SingleQueueStack {
    public static void main(String[] args){
        SingleQueueStack obj=new SingleQueueStack();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<n;i++){
            obj.push(sc.nextInt());
        }
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
    }
    Queue<Integer> q=new LinkedList<Integer>();
    void push(int x){
        int s=q.size();
            q.add(x);
        while(s>0){
            q.add(q.remove());
            s--;
        }
    }
    int pop(){
       if(q.isEmpty()){
           System.out.println("Stack is Empty");
           return -1;
       }
       else{
           return q.remove();
       }
    }
    int top(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
           return q.peek();
        }
    }

}
