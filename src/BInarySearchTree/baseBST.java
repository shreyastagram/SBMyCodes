package BInarySearchTree;

public class baseBST {
    public static void main(String[] args){
        BST bst=new BST();
        bst.root=new Node(4);
        bst.root.left=new Node(2);
        bst.root.right=new Node(6);
        bst.root.left.left=new Node(1);
        bst.root.left.right=new Node(3);
        bst.root.right.right=new Node(7);
        System.out.println("In-order Traversal is : ");
        bst.inOrderDFS(bst.root);


        int key=6;
        System.out.print("\nKey to be searched is : "+key);

        if(bst.search(bst.root,key)){
            System.out.print("\nKey found!");
        }
        else{
            System.out.print("\nKey not found!");
            }
        //updated the key to 9
        key=9;
        System.out.print("\nKey to be searched is : "+key);
        if(bst.search(bst.root,key)){
            System.out.print("\nKey found!");
        }
        else{
            System.out.print("\nKey not found!\n");
        }

        key=5;
        System.out.println("Adding key "+ key+" to the bst.");
        bst.insert(bst.root,key);
        System.out.println("In-order Traversal after insertion is : ");
        bst.inOrderDFS(bst.root);
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
    Node insert(Node node,int key){
        //adds a new node with a given key in the bst
        if(node==null){//inserts the key into the node if the node is null
            node=new Node(key);
            return node;
        }
        if(key<node.data){//checks if the key is lesser that the nodes data and if it is calls the insert func.
            //recursively on the left node of the current node
            node.left=(insert(node.left,key));
        }
        if(key>node.data){//checks if the key is greater that the nodes data and if it is calls the insert func.
            //recursively on the right node of the current node
            node.right=insert(node.right,key);
        }
        return node;
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
