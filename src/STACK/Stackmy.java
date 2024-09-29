package STACK;
import java.util.EmptyStackException;
import java.util.Stack;

public class Stackmy<T> {
    public static void main(String[] args){
        Stackmy<String> stack=new Stackmy<>(5);

        System.out.println("Is empty: "+stack.isEmpty());
        stack.push("Shreyash");
        stack.push("Rekha");
        stack.push("Suresh");
        System.out.println("Is empty: "+stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Is empty: "+stack.isEmpty());
        stack.push("Prachi");
        System.out.println(stack.pop());
        System.out.println("Is empty: "+stack.isEmpty());
    }
    T[] arr;
    int capacity;
    int index;

    public Stackmy(int capacity){
        this.capacity=capacity;
        arr=(T[]) new Object[capacity];
        index=-1;
    }
    public boolean isEmpty(){
        return index==-1;
    }
    public boolean isFull(){
        return index==capacity-1;
    }
    public void push(T data){
        if(isFull()){
            throw new StackOverflowError("Stack is Already full");
        }
        this.arr[++index]=data;
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[index--];
    }
}
