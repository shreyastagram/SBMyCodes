package BinaryTree;
import java.util.Scanner;
public class lowestCommonAncestor {
    public static void main(String[] args) {//main method that will call out findLca method from class BST
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size > 0) {
            int[] elementsArr = new int[size];
            for (int i = 0; i < size; i++) {
                elementsArr[i]=sc.nextInt();
                bst.insert(elementsArr[i]);
            }
            int n1=sc.nextInt();
            int n2=sc.nextInt();

            Nodde lca=bst.findLca(n1,n2);
            System.out.print(lca.data);
        }
        else{
            System.out.println("Size should be a positive Integer");
        }
    }
}

    class Nodde {
        int data;//data that will be saved in the current node
        Nodde left, right;//initialized nodes left and right child

        public Nodde(int value) {
            data = value;
            left = right = null;
        }
    }

    class BST {//class Binary search tree that will implement the lowest common ancestor method
        Nodde root;//initialized root of the tree

        BST() {
            root = null;//given the value null to the root until so value is given
        }

        void insert(int key) {//void function that will call the insertKey method to insert the desired key into the node
            root=insertKey(root, key);
        }

        Nodde insertKey(Nodde root, int key) {////method to insert the key in its appropriate node according to its key value
            //i.e. lesser or greater than the current nodes data
            if (root == null) {
                root = new Nodde(key);
            }
            if (key < root.data) {//finding the null root to insert the key on left of node if the value is lesser than nodes
                //data
                root.left = insertKey(root.left, key);
            }
            else if (key > root.data) {//finding the null root to insert the key on right of node if the value is greater than nodes
                //data
                root.right = insertKey(root.right, key);
            }
            return root;//returning the orignal root of the tree to maintain the tree structure
        }

        Nodde findLca(int n1, int n2) {//findLca(lowest common ancestor method) that will take the two nodes whose
            // ancestor has to be found.and call the lca method of class BST which will contain the main
            // code(Logic) to find the lca of the given two nodes.

            return lca(this.root, n1, n2);
        }

        Nodde lca(Nodde node, int n1, int n2) {//lca method to find the lca of given two nodes which takes the root as the
            //starting point of the search,n1(node1) and n2(node2) whose lca has to be found
            if (node == null) {
                return null;
            }
            if (n1 < node.data && n2 < node.data) {//calling lca recursively if n1 and n2 are less than nodes data.
                return lca(node.left, n1, n2);
            }
            if (n1 > node.data && n2 > node.data) {//calling lca recursively if n1 and n2 are greater than nodes data.
                return lca(node.right, n1, n2);
            }
            return node;//returning the node if n1 is less and n2 is greater that nodes data or v.v
        }
    }
