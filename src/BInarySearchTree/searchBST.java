package BInarySearchTree;

public class searchBST {
    public static void main(String[] args){
        BST bst=new BST();
        bst.root=new Node(4);
        bst.root.left=new Node(2);
        bst.root.right=new Node(6);
        bst.root.left.left=new Node(1);
        bst.root.left.right=new Node(3);
        bst.root.right.left=new Node(5);
        bst.root.right.right=new Node(7);
        System.out.println("In-order Traversal is : ");
        bst.inOrderDFS(bst.root);


        int key=5;
        System.out.print("\nKey to be searched is : "+key);

        if(bst.search(bst.root,key)){
            System.out.print("\nKey found!");
        }
        else{
            System.out.print("\nKey not found!");
            }
        key=9;
        System.out.print("\nKey to be searched is : "+key);
        if(bst.search(bst.root,key)){
            System.out.print("\nKey found!");
        }
        else{
            System.out.print("\nKey not found!");
        }
    }
}
class Node{
    //creates a Node class which will represent a node element in a tree
    int data;//value contained inside a node
    Node left,right;//left and right children of a node

    public Node(int value){
        data=value;//assigning value to node
        left=right=null;//assigning null value to left and right children of the node.
    }
}
class BST{
    //creating a class which will contain different functions of a BINARY SEARCH TREE
    Node root;//initialised a root node in bst
    BST(){
        root=null;
    }

    void inOrderDFS(Node node){//method to print he tree in inOrderDFS
        if(node==null){
            return;
        }
        //recursively go to the left subtree
        inOrderDFS(node.left);
        //printing the value
        System.out.print(node.data+" ");
        //recursively go to the right subtree
        inOrderDFS(node.right);
    }

    boolean search(Node node,int key){
        if(node==null) return false;

        //returning true if we found the key in the given BST
        if(node.data==key){
            return true;
        }
        if(key<node.data){
            return search(node.left,key);
        }
        else{
            return search(node.right,key);
        }
    }
}
