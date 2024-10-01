package BinaryTree;
class Node {
        int data;
        Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    class Tree {
        Node root;

        Tree() {
            root = null;
        }


        void preOrderDFS(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");

            preOrderDFS(node.left);

            preOrderDFS(node.right);
        }

        void inOrderDFS(Node node) {
            if (node == null) {
                return;
            }
            inOrderDFS(node.left);

            System.out.print(node.data + " ");

            inOrderDFS(node.right);
        }

        void postOrderDFS(Node node) {
            if (node == null) {
                return;
            }
            postOrderDFS(node.left);
            postOrderDFS(node.right);
            {
                System.out.print(node.data + " ");
            }
        }
    }
public class treeTraversals {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);

        tree.root.left=new Node(2);
        tree.root.right=new Node(3);

        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);

        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);

        System.out.print("\nPre-Order Traversal is : " );
        tree.preOrderDFS(tree.root);

        System.out.print("\nIn-Order Traversal is : ");
        tree.inOrderDFS(tree.root);

        System.out.print("\nPost-Order Traversal is : ");
        tree.postOrderDFS(tree.root);
    }
}
