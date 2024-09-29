package STACK;
import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class StackUSingArrays<T>{
    public static void main(String[] args)throws Exception{
        StackUSingArrays<String> s=new StackUSingArrays<>(5);
        System.out.println("Is Empty :"+ s.isEmpty());
        s.push("Bhan");
        s.push("Ambani");
        System.out.println("Is Empty :"+ s.isEmpty());
        System.out.println("Popped :"+s.pop());
        System.out.println("Popped :"+s.pop());
        System.out.println("Is Empty :"+ s.isEmpty());


    }
    T[] arr;
    int index;
    int capacity;

    public StackUSingArrays(int capacity){
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
    public void push(T data)throws Exception{
        if(isFull()){
            throw new StackOverflowError("Stack is already Full");
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
