package BinaryTree;
import java.util.*;
public class multiples5 {
    public static void main(String[] args){
        Tree tree=new Tree();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        if(size<=0){
            System.out.println("Size should be a positive integer");
        }
        else{
            int[] elementArr=new int[size];
            for(int i=0;i<size;i++){
                elementArr[i]=sc.nextInt();
            }
            tree.root=tree.insertNode(elementArr,tree.root,0);
            tree.printMultiplesOfRoot(tree.root);
        }
    }
}
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data=value;
            left=right=null;
        }
    }
    class Tree {
        Node root;

        Tree() {
            root = null;
        }

        public Node insertNode(int[] elementsArr,Node node,int i){
            if(i<elementsArr.length){
                node=new Node(elementsArr[i]);
                node.left=insertNode(elementsArr,node.left,2*i+1);
                node.right=insertNode(elementsArr,node.right,2*i+2);
            }
            return node;
        }
        public void printMultiplesOfRoot(Node node){
            if(root==null)return;

            int rootValue=root.data;
            if(rootValue==0){
                System.out.println("Division by zero is undefined");
                return;
            }
            inOrderPrintMultiples(node);
        }
        public void inOrderPrintMultiples(Node node){
            int rootValue=root.data;
            if(node==null){
                return;
            }
            inOrderPrintMultiples(node.left);

            if(node.data%rootValue==0){
                System.out.print(node.data+" ");
            }
            inOrderPrintMultiples(node.right);
        }
    }


