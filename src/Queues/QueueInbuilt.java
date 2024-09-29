package Queues;
import java.util.Queue;
import java.util.LinkedList;
public class QueueInbuilt {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Shreyash");
        q.add("Suresh");
        q.add("Borkar");
        System.out.println(q.peek());
        q.remove();
        q.remove();
        q.remove();
    }
}
