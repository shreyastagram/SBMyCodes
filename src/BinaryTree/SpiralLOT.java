package BinaryTree;
import java.util.Scanner;
public class SpiralLOT {

    public static void main(String[] args){
        //main class where we initialize the tree and take size as input and make an array of the elements of
        // the tree and pass it to the tree through insertNode func. Then we call method spiral to print the tree
        // in spiral order.
        Trre tree=new Trre();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        if(size<=0){
            System.out.println("Size should be a positive integer");
        }
        else{
            int[] elementsArr=new int[size];
            for(int i=0;i<size;i++){
                elementsArr[i]=sc.nextInt();
            }
            tree.root=tree.insertNode(elementsArr,tree.root,0);
            tree.spiral();

        }
    }

}

class Nodd{
    //I have used Nodd and Trre because I was not able to use Node as I was working in the same package
    //this class is used to initialize node in a tree
    int data;
    Nodd left,right;

    Nodd(int value){
        data=value;
        left=right=null;
    }
}
class Trre{//used Trre because of some limitations as mentioned in the previous Nodd class
    Nodd root;
    Trre(){
        root=null;
    }
    //inserting nodes in a tree
    public Nodd insertNode(int[] elementsArr,Nodd node,int i){
        if(i<elementsArr.length){
            node=new Nodd(elementsArr[i]);
            node.left=insertNode(elementsArr,node.left,2*i+1);
            node.right=insertNode(elementsArr,node.right,2*i+2);
        }
        return node;
    }


    public int height(Nodd root){
        //calculating height of a tree
        if(root==null) return 0;

        int leftHeight=1+height(root.left);
        int rightHeight=1+height(root.right);
        return Math.max(leftHeight, rightHeight);

    }
    void spiral(){
        //recursively calling printNodesAtLevel to print Nodes in a spiral order
        int h=height(root);
        boolean ltr=false;//as we want to print the order as left to right in second level
        for(int i=1;i<=h;i++){
            printNodesAtLevel(root,i,1,ltr);
            ltr=!ltr;//Invert ltr if its false it will become true and v.v.
        }
    }


    //Method to print nodes at given level
    void printNodesAtLevel(Nodd root,int level,int currentLevel,boolean ltr){
        if(root==null){
            return;
        }
        if(level==currentLevel){
            System.out.print(root.data+" ");
        }

        else{
            if(ltr){//printing left to right on a particular level if ltr==true
                printNodesAtLevel(root.left,level,currentLevel+1,ltr);
                printNodesAtLevel(root.right,level,currentLevel+1,ltr);
            }
            else{//printing from right to left on a particular level if ltr==false
                printNodesAtLevel(root.right,level,currentLevel+1,ltr);
                printNodesAtLevel(root.left,level,currentLevel+1,ltr);
            }

        }
    }
}
