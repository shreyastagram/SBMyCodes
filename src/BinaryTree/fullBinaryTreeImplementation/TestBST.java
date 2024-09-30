package BinaryTree.fullBinaryTreeImplementation;

import java.util.Comparator;

public class TestBST {
    public static void main(String[] args) {
        t1();
        t2();
        t3();
    }

    public static void t1() {
        // Create a BST that stores Strings and uses a String comparator
        BST<String> tree = new BST<>("Nagpur", new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // Add nodes to the tree
        tree.addNode("Ajmer");
        tree.addNode("Hyderabad");
        tree.addNode("Kanpur");
        tree.addNode("Zambia");
        tree.addNode("Russia");

        // Print the number of nodes in the tree
        System.out.println(tree.getNumberOfNodes());

        // Find and print nodes in the tree
        System.out.println(tree.find("Nagpur"));
        System.out.println(tree.find("Zambia"));

        // Convert tree to array and print it
        System.out.println(TestBST.toArray(tree));
    }

    public static <T extends Comparable<T>> String toArray(BST<T> tree) {
        // Assuming Array can accept generic type T
        return new Array<T>(tree.getRoot()).toString(); // Fixed to use Array constructor
    }



    public static void t2() {
        // Create a BST that stores Integers and uses a Comparator<Integer>
        BST<Integer> tree = new BST<>(13, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);  // Compare two integers using compareTo
            }
        });

        // Add nodes to the tree
        tree.addNode(3);
        tree.addNode(4);
        tree.addNode(12);
        tree.addNode(14);
        tree.addNode(10);
        tree.addNode(5);
        tree.addNode(1);
        tree.addNode(8);
        tree.addNode(2);
        tree.addNode(7);
        tree.addNode(9);
        tree.addNode(11);
        tree.addNode(6);
        tree.addNode(18);

        // Print the tree as an array
        System.out.println(TestBST.toArray(tree));
    }


    public static void t3() {
        // Create a BST that stores Integers and uses a Comparator<Integer>
        BST<Integer> tree = new BST<>(13, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);  // Compare two integers using compareTo
            }
        });

        try {
            // Add nodes to the tree
            tree.addNode(3);
            tree.addNode(4);
            tree.addNode(12);
            tree.addNode(14);
            tree.addNode(10);
            tree.addNode(5);
            tree.addNode(1);
            tree.addNode(8);
            tree.addNode(2);
            tree.addNode(7);
            tree.addNode(9);
            tree.addNode(11);
            tree.addNode(6);
            tree.addNode(18);

            // Print the tree as an array before deletion
            System.out.println(TestBST.toArray(tree));

            // Delete node with value 5 and print the tree again
            System.out.println("Removing node 5...");
            tree.deleteNode(tree.find(5));
            System.out.println(TestBST.toArray(tree));
        } catch (Exception e) {
            // Print the error message if any exception occurs
            System.out.println(e.getMessage());
        }
    }
}
