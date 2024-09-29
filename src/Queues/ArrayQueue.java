package Queues;

public class ArrayQueue {
    int front,rear;
    int[] arr;
    public ArrayQueue(int capacity){
        arr=new int[capacity];
        front=-1;
        rear=-1;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front+1;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void insert(int data){
        if(rear==arr.length-1){
            System.out.println("Overflow");
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }
    public int delete(){
        if(front==rear){
            return -1;//garbage value
        }
        else{
            front++;
            int del=arr[front];
            arr[front]=-123;//adding garbage value to the deleted index
            return del;
        }
    }
    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int peek(){
        if(this.isEmpty()){
            return -1;//garbage value
        }
        else{
            return arr[front+1];
        }
    }
    public static void main(String[] args){
        ArrayQueue q1=new ArrayQueue(5);
        q1.insert(1);
        q1.insert(2);
        q1.insert(3);
        q1.insert(4);
        q1.insert(5);
        q1.insert(6);//this will give overflow
        q1.printQueue();
        System.out.println(q1.isEmpty());
        System.out.println(q1.delete());
        System.out.println(q1.delete());
        q1.printQueue();
        System.out.println(q1.delete());
        System.out.println(q1.delete());
        System.out.println(q1.peek());
        System.out.println(q1.delete());
        System.out.println(q1.delete());//called on an empty queue
        System.out.println(q1.delete());//called on an empty queue
    }
}

