package BinaryTree.fullBinaryTreeImplementation;

import java.util.Comparator;

class Node<T extends Comparable<T>> {
    protected T value;
    protected Node<T> parent;
    protected Node<T> left, right;

    public Node(T value, Node<T> parent, Node<T> left, Node<T> right) {
        this.value = value;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return this.value;
    }

    public Node<T> getParent() {
        return this.parent;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public String toString() {
        return this.value.toString();
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setParent(Node<T> node) {
        this.parent = node;
    }

    public void setRight(Node<T> node) {
        this.right = node;
    }

    public void setLeft(Node<T> node) {
        this.left = node;
    }
}

class BST<T extends Comparable<T>> {
    protected Node<T> root;
    private Comparator<T> comparator;

    public BST(T value, Comparator<T> comparator) {
        root = new Node<>(value, null, null, null); // Initialize root
        this.comparator = comparator;
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public int getNumberOfNodes(){
            return this.getNumberOfNodes(this.root);
        }

        public Node<T> find(T value){
            return this.find(this.root,value);
        }

        private int getNumberOfNodes(Node<T> node){
            int numberOfNodes=1;
            if(node.getLeft()!=null){
                numberOfNodes += this.getNumberOfNodes(node.getLeft());
            }
            if(node.getRight()!=null){
                numberOfNodes += this.getNumberOfNodes(node.getRight());
            }
            return numberOfNodes;

        }
        public Node<T> setRight(Node<T> node,T value) throws Exception{
            if(node.getRight() !=null){
               throw new Exception("setRight failed because right child of node "+ node+" is already present!");
            }
            Node<T> child=new Node<>(value,node,null,null);
            node.setRight(child);
            return child;
        }

        public Node<T> setLeft(Node<T> node,T value)throws Exception{
            if(node.getRight()!=null){
                throw new Exception("setLeft failed because right child of the node"+node+"is already present");
            }
            Node<T> child=new Node<T>(value,node,null,null);
            node.setLeft(child);
            return child;
        }

        public void inorder(Node<T> node) {
            Node<T> left = node.getLeft();
            Node<T> right = node.getRight();

            if(left != null) {
                this.inorder(left);
            }
            System.out.println(node);
            if(right != null) {
                this.inorder(right);
            }
        }
        Node<T> insert(Node<T> node,T value){
            //adds a new node with a given key in the bst
            if(node==null){//inserts the key into the node if the node is null
                node=new Node(value,null,null,null);
                return node;
            }
            if(value.compareTo(node.getValue())<0){
                if(node.left==null){
                    node.left=new Node<>(value,node,null,null);
                }
                else {
                    node.left =insert(node.left, value);
                }
            }
            else if(value.compareTo(node.getValue())>0){
                if(node.right==null) {
                node.right=new Node<>(value,node,null,null);
                }
                else {
                    node.right = insert(node.right, value);
                }
            }
            return node;
        }
        public Node<T> addNode(T value){
            Node<T> node=new Node<T>(value,null,null,null);
            this.addNode(root,node);
            return node;
        }
        private void addNode(Node<T> parent, Node<T> node) {
            int compare=node.getValue().compareTo(parent.getValue());
            if(compare==0){
                return;
            }
            else if(compare<0){
                if(parent.getLeft()!=null){
                    this.addNode(parent.getLeft(),node);
                }
                else{
                    parent.setLeft(node);
                    node.setParent(parent);
                }
            }
            else if(compare>0){
                if(parent.getRight()!=null){
                    this.addNode(parent.getRight(),node);
                }
                else{
                    parent.setRight(node);
                    node.setParent(parent);
                }
            }
        }
        public void deleteNode(Node<T> node) throws Exception {
            Node<T> right = node.getRight();
            Node<T> left = node.getLeft();
            if (this.root != node) {
                Node<T> parent = node.getParent();
                Node<T> l = node.getLeft();
                Node<T> r = node.getRight();
                //if the node is a leaf node
                if (left == null && right == null) {
                    if (node == l) {
                        parent.setLeft(null);
                    } else if (node == r) {
                        parent.setRight(null);
                    } else {
                        System.out.println("The node doesn't Exist");
                    }
                }
                //if the node has only left child
                if (left != null && right == null) {
                    if (l == node) {
                        parent.setLeft(left);
                        left.setParent(parent);
                    } else {
                        parent.setRight(left);
                        left.setParent(parent);
                    }
                }
                if (left == null && right != null) {
                    if (r == node) {
                        parent.setRight(right);
                        right.setParent(parent);
                    } else {
                        parent.setLeft(right);
                        right.setParent(parent);
                    }
                }

                //if both the right and left child exist
                else if (left != null && right != null) {
                    Node<T> minmax = this.largest(left);
                    node.setValue(minmax.getValue());
                    this.deleteNode(minmax);
                }
            } else {//if this.root==node
                if (left == null && right == null) {//if no child exist
                    this.root = null;
                }
                else if (left != null && right == null) {//only left child exists
                    this.root = left;
                    left.setParent(null);
                }
                else if (left == null && right != null) {//only right child exists
                    this.root = right;
                    right.setParent(null);
                }
                else {//both left and right child exists
                    Node<T> minmax = this.largest(left);
                    node.setValue(minmax.getValue());
                    this.deleteNode(minmax);
                }
            }
        }


        private Node<T> smallest(Node<T> node){//finding the smallest node
            if(node.getLeft()==null){
                return node;
            }
             return this.smallest(node.getLeft());
        }
        private Node<T> largest(Node<T> node){//finding the largest node
            if(node.getRight()==null){
                return node;
            }
            return this.largest(node.getRight());
        }

        private Node<T> find(Node<T> node,T value){
            int compare=this.comparator.compare(value,node.getValue());
            if(compare==0){
                return node;
            }
            else if(compare<0){
                if(node.getLeft()!=null){
                    return this.find(node.getLeft(),value);
                }
                else{
                    return null;
                }
            }
            else {
                if(node.getRight()!=null){
                    return this.find(node.getRight(),value);
                }
                else{
                    return null;
                }
            }
        }


    }

