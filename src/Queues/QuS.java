package Queues;
import java.util.*;
public class QuS {
    public static void main(String[] args){
        ImplementQueue obj=new ImplementQueue();
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            obj.enQueue(sc.nextInt());
        }
        obj.deQueue();
        obj.deQueue();
        obj.deQueue();
    }}
    class ImplementQueue{
        Stack<Integer> s1=new Stack<>();
    public void deQueue(){
        if(s1.isEmpty()){
            System.out.println("no elements left");
            return;
        }
        if(s1.size()==1){
            int elem=s1.pop();
            System.out.println(elem);
            return;
        }
        int elem=s1.pop();
        deQueue();
        s1.push(elem);
    }
    public void enQueue(int data){
        s1.push(data);
    }
}
