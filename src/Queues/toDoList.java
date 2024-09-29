package Queues;
import java.util.Queue;
import java.util.LinkedList;

public class toDoList {
    public static void main(String args[]){
        MyQueue<String> ToDoList=new MyQueue<String>();

        makeToDoList(ToDoList);
        doAllTask(ToDoList);
    }
    public static void makeToDoList(MyQueue<String> ToDoList){//Enqueue
        ToDoList.add("task1");
        ToDoList.add("task2");
        ToDoList.add("task3");
        ToDoList.add("task4");
        ToDoList.add("task5");
    }
    public static void doAllTask(MyQueue<String> ToDoList){//Dequeue
        while(ToDoList.size()!=0){
            System.out.println(ToDoList.remove());
        }
    }
}
class MyQueue<T>{
    private LinkedList<T> list=new LinkedList<T>();
    public void add(T el){
        this.list.add(el);
    }
    public T remove(){
       return this.list.remove();
    }
    public int size(){
        return this.list.size();
    }

}
