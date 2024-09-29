package Queues;
import java.util.Queue;
import java.util.LinkedList;

public class QueueStack {
    public static void main(String[] args){
        StackUsingQueues stack=new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
class StackUsingQueues<T> {
    private LinkedList<T> q1 = new LinkedList<>();
    private LinkedList<T> q2 = new LinkedList<>();

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void push(T data) {
        q1.add(data);
    }

    public T pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack Is Empty");
        }
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        T poppedElement = q1.remove();

        LinkedList<T> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;

    }
}
