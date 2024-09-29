package STACK;
import java.util.EmptyStackException;
import java.lang.reflect.Array;

public class ArrayStack<T> {
    public static void main(String[] args){
        ArrayStack<String> stack=new ArrayStack<>(5);
        System.out.println("Is empty :"+ stack.isEmpty());
        stack.push("Mohan");
        stack.push("Mahesh");
        System.out.println("Is Empty: "+stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
    T[] arr;
    int capacity;
    int index;

    public ArrayStack(int capacity){
        this.capacity=capacity;
        arr=(T[]) new Object[capacity];
        index=-1;
    }
    public boolean isEmpty(){
        return index==-1;
    }
    public boolean isFull(){
        return index==this.capacity-1;
    }
    public void push(T data){
        if(isFull()){
            throw new StackOverflowError("Stack is already full");
        }
        else{
            this.arr[++index]=data;
        }
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[index--];
    }
}
