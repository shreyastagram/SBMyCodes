package BinaryTree;
import java.util.Scanner;
public class MirrorTree {
    public static void main(String[] args) {
        Tre tree = new Tre();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size should be a positive integer");
        }
        else {
            int[] elementsArr=new int[size];
            for (int i = 0; i < size; i++) {
                elementsArr[i]=sc.nextInt();
            }
            tree.root=tree.insertNode(elementsArr,tree.root,0);
            tree.mirror(tree.root);
            tree.preOrderDFS(tree.root);

        }
    }
}
class Nod{
    int data;
    Nod left,right;
    public Nod(int value){
        data=value;
        left=right=null;
    }
}
class Tre{
    Nod root;
    Tre(){
        root=null;
    }

    //Method to construct a binary tree from a given array
    public Nod insertNode(int[] elementsArr,Nod node,int i){
        if(i<elementsArr.length){
            node=new Nod(elementsArr[i]);
            node.left=insertNode(elementsArr,node.left,2*i+1);
            node.right=insertNode(elementsArr,node.right,2*i+2);
        }
return node;
    }

    void preOrderDFS(Nod node){
        //function to print the binary tree in preOrderDFS
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    public void mirror(Nod node){
        //checking if the root is null and if it is null then backtrack
        if(node==null)
            return;


        //traversing through the left and the right children of the node and mirroring left and right subtree
        mirror(node.left);
        mirror(node.right);

        //swapping node left and node right i.e. left and the right node
        Nod temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
