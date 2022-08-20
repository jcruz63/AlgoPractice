package trees;

class Node{
    private char data;
    private Node left;
    private Node right;

    Node(char data){
        this.data = data;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    private Node addRecursive(Node current, char data){
        if(current == null){
            return new Node(data);
        }

        if(data < current.getData()){
            current.setLeft(addRecursive(current.getLeft(), data));
        }

        else if(data > current.getData()){
            current.setRight(addRecursive(current.getRight(), data));
        } else {
            return current;
        }

        return current;
    }

    public void add(char data){
        root = addRecursive(root, data);
    }

    private boolean containsNodeRecursive(Node current, char data){
        if(current == null){
            return false;
        }

        if(data == current.getData()){
            return true;
        }
        return data < current.getData() ? containsNodeRecursive(current.getLeft(), data) : containsNodeRecursive(current.getRight(), data);
    }

    public boolean containsNode(char data){
        return containsNodeRecursive(root, data);
    }
}
