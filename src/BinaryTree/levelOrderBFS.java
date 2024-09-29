package BinaryTree;

public class levelOrderBFS {
    public static void main(String[] args){
        Treee tree=new Treee();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        tree.root.right.left=new Node(6);
        System.out.print("\n Level Order Traversal BSF is:- ");
        tree.levelOrderOrBFS();
    }
}
    class Nodee{
        int data;
        Node left,right;

        public Nodee(int value){
            data=value;
            left=right=null;
        }
    }
    class Treee{
        Node root;
        Treee(){
            root=null;
        }
        //Method to calculate the height of the tree
        int height(Node root){
            if(root==null){
                return 0;
            }
            int leftHeight=1+height(root.left);
            int rightHeight=1+height(root.right);
            if(leftHeight>rightHeight){
                return leftHeight;
            }
            else{
                return rightHeight;
            }
        }

        void levelOrderOrBFS(){
            int h=height(root);
            for(int i=0;i<=h;i++){
                printNodesAtLevel(root,i,1);
            }
        }
        void printNodesAtLevel(Node root,int level,int currentLevel){
            if(root==null){
                return;
            }
            if(level==currentLevel){
                System.out.print(root.data+" ");
            }
            else{
                printNodesAtLevel(root.left,level,currentLevel+1);
                printNodesAtLevel(root.right,level,currentLevel+1);
            }
        }

    }
