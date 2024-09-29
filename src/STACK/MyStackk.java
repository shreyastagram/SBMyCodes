package STACK;
import java.util.LinkedList;
import java.util.*;

public class MyStackk<T> {
    public static void main(String[] args) throws Exception {
        MyStackk<String> stack = new MyStackk<>();
        System.out.println(stack.peek());
        stack.push("OOP");
        stack.push("ALGO");
        stack.push("MIN");
        System.out.println(stack.peek());

        try {
            while (!stack.isEmpty()) {
                System.out.println("popped " + stack.pop());
            }
        } catch (EmptyStackException e) {
            System.out.println("Done");
        }
        System.out.println(stack.isEmpty());

    }

    private final LinkedList<T> list = new LinkedList<>();

    public void push(T e) {
        list.add(e);
    }

    public T pop() {
        if (this.list.size() > 0) {
            T e = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return e;
        }
        throw new EmptyStackException();
    }

    public boolean isEmpty() {
        return this.list.size() == 0;
    }

    public T peek() {
            if (list.size() > 0) {
                return list.get(list.size() - 1);
            }
        else{
           System.out.println("List is Empty");
        }
        return null;
    }
}
