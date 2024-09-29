package BinaryTree;

import java.util.Queue;
import java.util.LinkedList;
public class LEVELORDERITERATIVE {
    public static void main(String[] args) {
        Trees tree = new Trees();
        tree.root=new Nodes(1);
        tree.root.left=new Nodes(2);
        tree.root.right=new Nodes(3);
        tree.root.left.left=new Nodes(4);
        tree.root.left.right=new Nodes(5);
        tree.root.right.left=new Nodes(6);
        tree.root.right.right=new Nodes(7);
        System.out.println("Level-Order Traversal : ");
        tree.levelOrderBFS();
    }
}
class Nodes{
    int data;
    Nodes left,right;

    public Nodes(int value){
        data=value;
        left=right=null;
    }
}
class Trees {
    Nodes root;
    Trees() {
        root = null;
    }
    void levelOrderBFS() {
        Queue<Nodes> q = new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            Nodes temp = q.peek();

            q.remove();
            if(temp.data>max){
                max=temp.data;
            }
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
}
